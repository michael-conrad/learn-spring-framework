package com.michael_conrad.learn_spring_framework.examples.c1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RealWorldInjectionAppLauncherApplication {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(RealWorldInjectionAppLauncherApplication.class)) {
//            Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
            var service = ctx.getBean(BusinessCalculationService.class);
            System.out.printf("Data Service Max: %,d\n", service.findMax());
        }
    }
}
