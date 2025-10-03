package com.michael_conrad.learn_spring_framework.examples.f1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
    }

    @PostConstruct
    public void initialize() {
        System.out.println("Initializing SomeClass");
        someDependency.getReady();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying SomeClass");
    }
}

@Component
class SomeDependency {
    public void getReady() {
        System.out.println("SomeDependency getReady");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationsContextLauncherApplication {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(PrePostAnnotationsContextLauncherApplication.class)) {
            Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        }
        // @PreDestroy happens when the var ctx's scope is exited triggering the AutoClose call.
        System.out.println("Done");
    }
}
