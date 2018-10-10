package com.jesse.chapter2.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages={"com.jesse.soundsystem"})
public class CDPlayerConfig {
	
}
