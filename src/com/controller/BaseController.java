package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ModelAttribute;

import com.exception.UserLoginNoException;

public class BaseController {
	@ModelAttribute
	public void isLogin(HttpSession session, HttpServletRequest request)throws UserLoginNoException {
		if (session.getAttribute("bruser") == null) {
			throw new UserLoginNoException("没有登录");
		}
	}
}
