package com.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AnotherConfig;
import com.demo.config.Config;
import com.demo.model.Person;

public class ComponentConditionalRegistryTest {

    public static void main(String[] args){
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        String[] names = ctx.getBeanNamesForType(Person.class);
        for(String name:names){
            System.out.println("name : " + name);
        }

        System.out.println("Spring init with AnotherConfig");
        AnnotationConfigApplicationContext ctx1 = new AnnotationConfigApplicationContext(AnotherConfig.class);
        String[] beanNames = ctx1.getBeanNamesForType(Person.class);
        for(String name:beanNames){
            System.out.println("name : " + name);
        }

    }

}
