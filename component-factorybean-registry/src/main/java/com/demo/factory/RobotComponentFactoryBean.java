package com.demo.factory;

import org.springframework.beans.factory.FactoryBean;

import com.demo.model.RobotComponent;

public class RobotComponentFactoryBean implements FactoryBean<RobotComponent> {

    public RobotComponent getObject() throws Exception {
        return new RobotComponent();
    }

    public Class<?> getObjectType() {
        return RobotComponent.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
