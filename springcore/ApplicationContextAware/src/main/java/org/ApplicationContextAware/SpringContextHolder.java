package org.ApplicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContextHolder implements ApplicationContextAware {
	private static ApplicationContext applicationContext = null;
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(String name) {
		return (T)applicationContext.getBean(name);
	}
	
	public static <T> T getBean(Class<T> requireType) {
		return applicationContext.getBean(requireType);
	}
	
	public static void clearHolder() {
		applicationContext = null;
	}
	
	public void setApplicationContext(ApplicationContext applicationContext) {
		SpringContextHolder.applicationContext = applicationContext;
	}
	
	
}
