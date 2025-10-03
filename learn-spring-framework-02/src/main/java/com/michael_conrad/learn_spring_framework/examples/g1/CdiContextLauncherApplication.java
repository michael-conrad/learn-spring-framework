package com.michael_conrad.learn_spring_framework.examples.g1;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Named
class BusinessService {
    private DataService dataService;

    public DataService getDataService() {
        return dataService;
    }

    @Inject
    public void setDataService(DataService dataService) {
        System.out.println("Setting DataService");
        this.dataService = dataService;
    }
}

@Named
class DataService {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
    public static void main(String[] args) {
        try (var ctx = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
            Arrays.stream(ctx.getBeanDefinitionNames()).forEach(System.out::println);
            System.out.println(ctx.getBean(BusinessService.class).getDataService());
        }
        System.out.println("Done.");
    }
}
