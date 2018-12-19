package com.yiibai.springJavaConfigUseJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
public class CDPlayerConfig {
	@Bean
	public CDPlayer cdplayer(CompactDisc compactDisc) {
		System.out.println("new CDPlayer");
		return new CDPlayer(compactDisc);
	}
	
}
