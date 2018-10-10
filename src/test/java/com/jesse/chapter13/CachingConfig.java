package com.jesse.chapter13;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

@Configuration
@EnableCaching
public class CachingConfig {
	
	@Bean
	public CacheManager cacheManager() {
		return new ConcurrentMapCacheManager(); 
	}
	
	@Bean
	public EhCacheManagerFactoryBean ehcache() {
		EhCacheManagerFactoryBean ehCacheFactoryBean = new EhCacheManagerFactoryBean();
		ehCacheFactoryBean.setConfigLocation(new ClassPathResource("classpath:ehcache.xml"));
		return ehCacheFactoryBean;
	}
	
		
	

}
