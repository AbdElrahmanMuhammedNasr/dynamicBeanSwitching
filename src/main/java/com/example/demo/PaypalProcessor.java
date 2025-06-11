package com.example.demo;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PaypalProcessor implements PaymentProcessor {

    @Override
    public void process(String request) {
        System.out.println("Processing payment with Paypal... "+ request);
    }
}
