package com.ly.spring.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ly.spring.annotation.PrintTime;
import com.ly.spring.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping(value = "/serviceAspect", method={RequestMethod.GET})
    public  String serviceAspect(){
        return userService.serviceAspect();
    }
    @RequestMapping(value = "/controllerAspect", method={RequestMethod.GET})
    @PrintTime
    public String name(){
        return "controllerAspect";
    }
}
