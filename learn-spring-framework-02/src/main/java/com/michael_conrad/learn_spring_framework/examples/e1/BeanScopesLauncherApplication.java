package com.michael_conrad.learn_spring_framework.examples.e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class BeanScopesLauncherApplication {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {
            Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
        }
    }
}
