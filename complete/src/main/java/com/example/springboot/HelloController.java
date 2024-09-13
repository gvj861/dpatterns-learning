package com.example.springboot;

import com.example.springboot.BRIDGE.Dog;
import com.example.springboot.BRIDGE.LandBreathe;
import com.example.springboot.BRIDGE.LivingThings;
import com.example.springboot.Composite.ArithmeticExpression;
import com.example.springboot.Composite.Expression;
import com.example.springboot.Composite.Number;
import com.example.springboot.Composite.Operation;
import com.example.springboot.DBInstance.DynamoDB;
import com.example.springboot.Decorator.BasePizza;
import com.example.springboot.Decorator.ExtraCheese;
import com.example.springboot.Decorator.Jalapeno;
import com.example.springboot.Decorator.MargheretaPizza;
import com.example.springboot.DocManager.DocumentManager;
import com.example.springboot.Iterator.CustomList;
import com.example.springboot.Iterator.Iterator;
import com.example.springboot.Iterator.ListIterator;
import com.example.springboot.NullObject.Car;
import com.example.springboot.NullObject.Vehicle;
import com.example.springboot.NullObject.VehicleFactory;
import com.example.springboot.Proxy.IPaymentService;
import com.example.springboot.Proxy.ProxyRazor;
import com.example.springboot.Proxy.RazorPayService;
import com.example.springboot.dialog.Dialog;
import com.example.springboot.dialog.HtmlDialog;
import com.example.springboot.document.Document;
import com.example.springboot.document.TextDoc;
import com.example.springboot.house.House;
import com.example.springboot.payment.OriginalPaymentProcessor;
import com.example.springboot.payment.PaymentAdapter;
import com.example.springboot.payment.PaymentProcessor;
import com.example.springboot.payment.RazorPay;
import com.example.springboot.repo.User;
import com.example.springboot.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class HelloController {

	@Autowired
	private UserRepo userRepo;

	private LocalDateTime startTime;

	private static Dialog dialog;

    @GetMapping("/")
	public List<User> index() {
		startTime = LocalDateTime.now();
		dialog = new HtmlDialog();
		dialog.renderWindow();

		House house = new House.HouseBuilder("Concrete", "Brick", "Tiles")
				.setHasGarage(true)
				.setHasSwimmingPool(true)
				.setHasGarden(false)
				.setHasStatues(true)
				.build();
		System.out.println(house);

		DynamoDB dynamoDB = DynamoDB.getDynamoDBInstance("abcd");
		DynamoDB dynamoDB1 = DynamoDB.getDynamoDBInstance("abcdef");
		System.out.println(dynamoDB + " " + dynamoDB1 + " " + dynamoDB1.equals(dynamoDB));

		DocumentManager dm = new DocumentManager();
		TextDoc d1 = (TextDoc) dm.createDocument("text");
		TextDoc d2 = (TextDoc) dm.createDocument("text");
		System.out.println(d1.getContent() + " " + d2.getContent());
		d2.setContent("NO NI");
		System.out.println(d1.getContent() + " " + d2.getContent());

		PaymentProcessor pp1 = new OriginalPaymentProcessor();
		pp1.pay();
		PaymentProcessor pp = new PaymentAdapter(new RazorPay());
		pp.pay();


		ArithmeticExpression leftExpression = new Number(2);
		ArithmeticExpression secondNumber = new Number(3);
		ArithmeticExpression thirdNumber = new Number(4);
		ArithmeticExpression rightExpression = new Expression(secondNumber,thirdNumber, Operation.ADD);
		ArithmeticExpression parentExpression = new Expression(leftExpression,rightExpression,Operation.MULTIPLY);
		System.out.println(parentExpression.evaluate());


		LivingThings dog = new Dog(new LandBreathe());
		dog.breatheProcess();


		BasePizza pizza = new ExtraCheese(new MargheretaPizza());
		System.out.println(pizza.cost());
		pizza = new Jalapeno(pizza);
		System.out.println(pizza.cost());


		IPaymentService paymentService = new ProxyRazor(new RazorPayService());
		paymentService.pay();

		// Null object design pattern

		Vehicle v1 = VehicleFactory.getVehicle("Car");
		Vehicle v2 = VehicleFactory.getVehicle("Bike");
		System.out.println(v1.getSeatCapacity());
		System.out.println(v2.getSeatCapacity()); // Returns 0, and no need to check null

		CustomList<Integer> cn = new CustomList<>();
		cn.addItem(34);
		cn.addItem(133);
		cn.addItem(23);
		Iterator<Integer> it = cn.createIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		List<User> res = userRepo.findAll();
		System.out.println("Time to process : " + Duration.between(LocalDateTime.now() , startTime).getNano());
		return res;
	}

}
