package com.springboot;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@ComponentScan  //触发扫描同级包controller的bean
@Import(AutoConfigurationImportSelector.class)
public @interface MySpringBootApplication {
}
