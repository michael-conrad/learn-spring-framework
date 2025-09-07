package com.michael_conrad.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {
};

record Address(String street, String city, String state) {
};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Mario";
    }

    @Bean
    public int age() {
        return 30;
    }

    @Bean
    public Person person() {
        return new Person("Mario", 30);
    }

    @Bean(name = "address2")
    public Address address() {
        return new Address("123 Main St", "Springfield", "IL");
    }

}
