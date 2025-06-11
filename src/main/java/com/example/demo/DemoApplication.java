package com.example.demo;

import com.example.demo.code.PaymentProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.Map;


@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String name : beanNames) {
            System.out.println(name);
        }

        System.out.println("===============================================");
        Map<String, PaymentProcessor> processors = context.getBeansOfType(PaymentProcessor.class);
        for (Map.Entry<String, PaymentProcessor> entry : processors.entrySet()) {
            System.out.println("Bean name: " + entry.getKey() + ", Bean class: " + entry.getValue().getClass());
        }
    }

}
