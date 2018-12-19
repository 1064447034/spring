package com.ly.spring.processor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PrintTimeProcessor {
    @Pointcut("@annotation(com.ly.spring.annotation.PrintTime)")
    public void printTimePoint() {
    }
    @Around("printTimePoint()")
    public Object process(ProceedingJoinPoint jp) throws Throwable{
        System.out.println("开始运行程序。。。Start==>");
        Object proceed = jp.proceed();
        System.out.println("结束啦，运行结束==>");
        return proceed;
    }
}
