package com.jesse.chapter10;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
/*@ImportResource("classpath:spring-mybatis.xml")*/
public class JdbcConfig {
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/jessedb?useUnicode=true&characterEncoding=utf8&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&failOverReadOnly=false");
		ds.setUsername("root");
		ds.setPassword("123456");
		return ds;		
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}
	
/*	@Bean
	public JdbcSpitterRepository jdbcSpitterRepository(JdbcTemplate jdbcTemplate) {
		return new JdbcSpitterRepository(jdbcTemplate);
	}
	
	@Bean
	public JdbcSpittleRepository jdbcSpittleRepository(JdbcTemplate jdbcTemplate) {
		return new JdbcSpittleRepository(jdbcTemplate);
	}*/

}
