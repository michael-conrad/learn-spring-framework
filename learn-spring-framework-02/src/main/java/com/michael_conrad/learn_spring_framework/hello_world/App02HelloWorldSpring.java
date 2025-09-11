package com.michael_conrad.learn_spring_framework.hello_world;

import com.michael_conrad.learn_spring_framework.hello_world.HelloWorldConfiguration.Address;
import com.michael_conrad.learn_spring_framework.hello_world.HelloWorldConfiguration.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
            System.out.println(ctx.getBean("name"));
            System.out.println(ctx.getBean("age"));
            System.out.println(ctx.getBean("person"));
            System.out.println(ctx.getBean("person2MethodCall"));
            System.out.println(ctx.getBean("person3Parameters"));
            System.out.println(ctx.getBean("address2"));
            System.out.println(ctx.getBean(Address.class));
            System.out.println(ctx.getBean(Person.class));
            System.out.println(ctx.getBean("person5Qualifier"));
        }
    }
}
