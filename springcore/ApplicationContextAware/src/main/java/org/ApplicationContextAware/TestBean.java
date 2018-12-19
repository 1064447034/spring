package org.ApplicationContextAware;

import org.springframework.stereotype.Component;

@Component
public class TestBean {
	private String name = "1234";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
