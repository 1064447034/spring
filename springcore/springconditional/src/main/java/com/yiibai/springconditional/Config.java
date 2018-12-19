package com.yiibai.springconditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
@Conditional(MyConditional.class)
public class Config {
	@Bean
	public DataSource create() {
		return new DbcpDataSource();
	}
}
