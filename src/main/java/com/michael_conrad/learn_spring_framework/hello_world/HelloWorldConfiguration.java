package com.michael_conrad.learn_spring_framework.hello_world;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
        return new Person("Luigi", 23, new Address("445 Center St", "Blankenship", "WI"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address3) {
        return new Person(name, age, address3);
    }

    @Bean
    @Primary
    public Person person4Parameters(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address);
    }


    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("123 Main St", "Springfield", "IL");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("456 Main St", "Springfield", "IL");
    }

    public record Person(String name, int age, Address address) {
    }

    public record Address(String street, String city, String state) {
    }

}
