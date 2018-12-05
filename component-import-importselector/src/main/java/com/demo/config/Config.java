package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.demo.model.Person;
import com.demo.other.ThirdPatryBean;

@Configuration
@Import({ThirdPatryBean.class, MyImportSelector.class})
// @Import 导入的bean id 默认为全类名
public class Config {

    @Bean
    Person getPerson(){
        return new Person("Person");
    }

}
