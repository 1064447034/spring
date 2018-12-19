package com.ly.springoldaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		//如果是web项目，则使用注释的代码加载配置文件，这里是一般的Java项目，所以使用下面的方式
	    ApplicationContext appCtx = new ClassPathXmlApplicationContext("application.xml");
//		ApplicationContext appCtx = new FileSystemXmlApplicationContext("application.xml");
		Sleepable me = (Sleepable)appCtx.getBean("proxy");
		me.sleep();
	}

}
