package com.ly.springApplicationListener;

import org.junit.runner.RunWith;
import org.springframework.context.ApplicationEvent;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class StudentAddEventTest extends ApplicationEvent {
	private String name;
	
	public StudentAddEventTest(Object source, String name) {
		super(source);
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
