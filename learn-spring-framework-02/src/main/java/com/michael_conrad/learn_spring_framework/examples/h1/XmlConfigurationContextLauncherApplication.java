package com.michael_conrad.learn_spring_framework.examples.h1;

import com.michael_conrad.learn_spring_framework.game.GameRunner;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigurationContextLauncherApplication {
    public static void main(String[] args) {
        try (var ctx = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
            Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(ctx.getBean("name"));
            System.out.println(ctx.getBean("age"));
            ((GameRunner) ctx.getBean("gameRunner")).run();
        }
    }
}
