package com.ly.recyledi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//		System.out.println(context.getBean("a", StudentA.class));
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		System.out.println(context.getBean(StudentA.class).getStudentB());
		
	}
}
