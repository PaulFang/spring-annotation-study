package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

import com.demo.model.Person;

@Configuration
@ComponentScan(value="com.demo",
excludeFilters={@ComponentScan.Filter(type=FilterType.ANNOTATION,classes={Controller.class})})
// 当希望仅仅扫描 includeFilters 的配置的包中的bean时，需要配和使用 use-default-filters = false
// 支持类配置上使用多个 @ComponenetScan 注解，或使用 @ComponentScans
public class MainConfig {

    @Bean("personBeanId")
    public Person person() {
        return new Person("Wangwu", 22);
    }

}
