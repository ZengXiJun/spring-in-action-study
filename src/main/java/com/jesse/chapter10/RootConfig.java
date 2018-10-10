package com.jesse.chapter10;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
/*@ComponentScan("com.jesse.chapter10")
@Import({JdbcConfig.class, CachingConfig.class})*/
@ImportResource("classpath:spring-cachingconfig.xml")
public class RootConfig {

}
