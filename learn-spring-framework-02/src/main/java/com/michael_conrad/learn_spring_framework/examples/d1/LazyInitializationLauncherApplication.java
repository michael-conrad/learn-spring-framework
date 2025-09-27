package com.michael_conrad.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
@Lazy
class ClassB {
    private final ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some Initialization Logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("Doing something");
    }
}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
            System.out.println("Initialization of context is completed");
            ctx.getBean(ClassB.class).doSomething();
        }
    }
}
