package com.ly.spring.service;

import org.springframework.stereotype.Service;

import com.ly.spring.annotation.PrintTime;

@Service
public class UserService {
	@PrintTime
    public String serviceAspect(){
    	System.out.println("Service层---测试切面");
        return "serviceAspect";
    }
}

