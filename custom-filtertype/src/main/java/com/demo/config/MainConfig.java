package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import com.demo.bean.Person;

@Configuration
@ComponentScan(value="com.demo",useDefaultFilters = false, includeFilters = {@ComponentScan.Filter(type=FilterType.CUSTOM,classes={MyTypeFilter.class})})
public class MainConfig {

    @Bean("personBeanId")
    public Person person() {
        return new Person("Wangwu", 22);
    }

}
