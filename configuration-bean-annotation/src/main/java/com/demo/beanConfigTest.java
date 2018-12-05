package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.bean.Person;
import com.demo.config.PersonConfig;

public class beanConfigTest {

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);
    }
}
