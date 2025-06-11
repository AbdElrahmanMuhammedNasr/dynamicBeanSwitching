package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class PaymentService {
    private final Map<String, PaymentProcessor> processors;

    public PaymentService(Map<String, PaymentProcessor> processors) {
        this.processors = processors;
    }

    public void processPayment(String type, String request) {
         processors.get(type).process(request);
    }
}
