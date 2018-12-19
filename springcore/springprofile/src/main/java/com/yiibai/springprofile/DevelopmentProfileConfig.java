package com.yiibai.springprofile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DevelopmentProfileConfig {
	@Bean
	@Profile("dbcp")
	public DataSource dbcpDataSource() {
		return new DbcpDataSource();
	}
	
	@Bean
	@Profile("jndi")
	public DataSource jndiDataSource() {
		return new JndiDataSource();
	}
	
	@Bean
	@Profile("embedded")
	public DataSource embeddedDataSource() {
		return new EmbeddedDataSource();
	}
}
