package com.example.springboot;

import com.example.springboot.DBInstance.DynamoDB;
import com.example.springboot.dialog.Dialog;
import com.example.springboot.dialog.HtmlDialog;
import com.example.springboot.house.House;
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

		List<User> res = userRepo.findAll();
		System.out.println("Time to process : " + Duration.between(LocalDateTime.now() , startTime).getNano());
		return res;
	}

}
