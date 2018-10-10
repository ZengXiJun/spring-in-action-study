package com.jesse.chapter2.autoconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource("classpath:spring-mvc.xml")
public class SystemConfig {

}
