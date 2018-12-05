package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.demo.condition.LinuxCondition;
import com.demo.condition.WindowsCondition;
import com.demo.model.Person;

@Configuration
@Conditional(WindowsCondition.class)
// @Conditional 标注在类上，对整个类的每个配置方法起效，若该类下的配置方法也有 @Conditional 则也一并有效
public class AnotherConfig {

    @Bean
    @Conditional(LinuxCondition.class)
    public Person personLinux(){
        return new Person("Linux");
    }

    @Bean
    @Conditional(WindowsCondition.class)
    public Person personWindows(){
        return new Person("Windows");
    }

    @Bean
    public Person anotherPerson(){return new Person("Another person");}

}

