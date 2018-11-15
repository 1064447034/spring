package com.ly.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class LoginAction {
	@RequestMapping("/login")
	public void login(HttpServletRequest req, HttpServletResponse res) {
		// 登录功能.
	}

	// 需要登录完成后才可访问
	@LoginMethod
	@RequestMapping(value = "/userList")
	public void userList(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("request...");
	}
}
