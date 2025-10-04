package com.michael_conrad.learn_spring_framework.examples.c1;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {
}

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
}

@Configuration
@ComponentScan
public class RealWorldInjectionAppLauncherApplication {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(RealWorldInjectionAppLauncherApplication.class)) {
            System.out.println(ctx.getBean(NormalClass.class));
            System.out.println(ctx.getBean(NormalClass.class));

            System.out.println(ctx.getBean(PrototypeClass.class));
            System.out.println(ctx.getBean(PrototypeClass.class));
            System.out.println(ctx.getBean(PrototypeClass.class));
        }
    }
}
