package com.springAOP.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/applicationContext.xml"})
public class TestAspect {
	@Autowired
	private Sleepable sleep;

	@Test
	public void play() {
		sleep.sleep();
		
	}
}


//public class TestAspect {
//	public static void main(String[] args) {
//		ApplicationContext appCtx = new FileSystemXmlApplicationContext("classpath*:/applicationContext.xml");  
//        Sleepable me = (Sleepable)appCtx.getBean("me");  
//        me.sleep();  
//	}
//}