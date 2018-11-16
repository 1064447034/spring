package com.ly.springannotationaop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SleepHelper {
	public SleepHelper() {

	}

	@Pointcut("execution(* *.sleep())")
	public void sleeppoint() {
	}

	@Before("sleeppoint()")
	public void beforeSlee() {
		System.out.println("睡觉前要脱衣服!");
	}

	@AfterReturning("sleeppoint()")
	public void afterSleep() {
		System.out.println("睡醒了要穿衣服！");
	}

	public void doThrowing(JoinPoint point, Throwable ex) {
		System.out.println("doThrowing::method " + point.getTarget().getClass().getName() + "."
				+ point.getSignature().getName() + " throw exception");
		System.out.println(ex.getMessage());
	}
	
}
