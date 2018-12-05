package com.demo.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition implements Condition {

    public boolean matches(ConditionContext conditionContext,
        AnnotatedTypeMetadata annotatedTypeMetadata) {
        Environment env = conditionContext.getEnvironment();
        String osName = env.getProperty("os.name");
        if(osName.contains("Windows")){
            return true;
        }
        return false;
    }
}
