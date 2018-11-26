package org.InitializingBean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class TestInitializingBean implements InitializingBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("test initializingBean");
	}
	
	public void testInit() {
		System.out.println("test init-method");
	}
}
