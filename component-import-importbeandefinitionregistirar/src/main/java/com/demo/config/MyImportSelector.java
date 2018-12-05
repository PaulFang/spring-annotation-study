package com.demo.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {

    // 方法的返回值就是要导入到容器中的组件的全类名
    // AnnoationMetedata： 当前标注 @Import 注解的类的所有注解信息
    public String[] selectImports(AnnotationMetadata annotationMetadata) {

        // code your rule here for importing the target class
        return new String[]{"com.demo.other.AnotherBean"};
    }
}
