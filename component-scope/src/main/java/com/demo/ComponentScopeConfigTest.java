package com.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.demo.model.Animal;
import com.demo.model.Person;
import com.demo.config.Config;

public class ComponentScopeConfigTest {

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

        Animal animal_A = ctx.getBean("animal", Animal.class);
        Animal animal_B = ctx.getBean("animal", Animal.class);
        System.out.println("The Spring container hold only one Animal object ? " + (animal_A==animal_B));

        System.out.println("\n\n");

        Person person1 = ctx.getBean("person", Person.class);
        Person person2 = ctx.getBean("person", Person.class);
        System.out.println("person1: " + person1.hashCode());
        System.out.println("person2: " + person2.hashCode());
        System.out.println("The Spring container hold only one Persion object ? " + (person1==person2));
    }
}
