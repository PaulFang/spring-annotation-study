package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.bean.Person;

public class XmlConfigTest {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        Person person = ctx.getBean("person", Person.class);
        System.out.println(person);

    }

}
