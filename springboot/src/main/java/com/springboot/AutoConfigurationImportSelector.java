package com.springboot;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class AutoConfigurationImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        //... ...数组中就是返回的需要自动装配的类：WebServerAutoConfiguration
        //springBoot + 第三方的jar包

        //jar-->META-inf/spring.factories EnableAutoConfiguration
        return new String[0];
    }
}
