package com.wisely.spring_boot_starter_hello;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@ConfigurationProperties(prefix="hello")
@PropertySource({"classpath:spring/resource.properties"})
public class HelloServiceProperties {
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}
