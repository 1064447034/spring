package com.ly.interceptor;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.MethodProxy;

public class SystemMethodInterceptor implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("interceptor");
		Method method = arg0.getMethod();
		if (method.isAnnotationPresent(LoginMethod.class)) {
			User user = null;//sessionUtil.getCurrUser();
			if (user == null) {
				return null;
			} else {
				return arg0.proceed();
			}
		} else {
			return arg0.proceed();
		}
	}

	
}
