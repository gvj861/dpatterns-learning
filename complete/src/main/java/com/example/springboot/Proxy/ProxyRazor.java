package com.example.springboot.Proxy;

public class ProxyRazor implements IPaymentService {
    private IPaymentService paymentService;

    public ProxyRazor(IPaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Override
    public void pay() {
        before();
        paymentService.pay();
        after();
    }

    private void before() {
        System.out.println("Before");
    }

    private void after() {
        System.out.println("After");
    }
}
