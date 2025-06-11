package com.example.demo.code;

import org.springframework.stereotype.Component;

@Component("visa")
public class VisaProcessor implements PaymentProcessor {

    @Override
    public void process(String request) {
        System.out.println("Processing payment with Visa..." + request);
    }
}
