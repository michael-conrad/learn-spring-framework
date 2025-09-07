package com.michael_conrad.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // Launch the Spring application

        var ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // Configure Spring
        System.out.println(ctx.getBean("name"));
        System.out.println(ctx.getBean("age"));
        System.out.println(ctx.getBean("person"));
        Object address2 = ctx.getBean("address2");
        System.out.println(address2);
        Address address = ctx.getBean(Address.class);
        System.out.println(address);
    }
}
