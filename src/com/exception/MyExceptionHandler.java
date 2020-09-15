package com.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.po.User;

public class MyExceptionHandler implements HandlerExceptionResolver{

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("ex", arg3);
		if (arg3 instanceof UserLoginNoException) {
			arg0.setAttribute("user", new User());
			arg0.setAttribute("msg", "没有登录，请登录！");
			arg0.setAttribute("lastPath", arg0.getServletPath());
			//lastPath把刚刚的请求路径(如："/toAsk")存储起来当登录成功后跳转到之
			return new ModelAndView("/login", model);
		} else {
			return new ModelAndView("/error/error", model);
		}
	}
}
