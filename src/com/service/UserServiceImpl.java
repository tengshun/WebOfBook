package com.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.dao.UserDao;
import com.po.User;

@Service
public class UserServiceImpl implements UserService{
@Autowired
private UserDao userDao;
	@Override
	public String register(User user, Model model, HttpSession session, String code) {
		if (!code.equalsIgnoreCase(session.getAttribute("code").toString())) {
			model.addAttribute("codeError", "验证码错误");
			return "register";
		}
		int n = userDao.register(user);
		if (n > 0) {
			return "login";
		}else {
			model.addAttribute("msg", "注册失败！");
			return "register";
		}
	}
	@Override
	public String login(User user, Model model, HttpSession session, String code, String lastPath) {
		if (!code.equalsIgnoreCase(session.getAttribute("code").toString())) {
			model.addAttribute("msg", "验证码错误!");
			return "login";
		}
		User ruser = null;
		List<User> list = userDao.login(user);
		if (list.size() > 0) {
			ruser = list.get(0);
		}
		if (ruser != null) {
			session.setAttribute("bruser", ruser);
			if (lastPath != null && lastPath != "") {
				return "forward:" + lastPath;
			} else {
				return "forward:/home";
			}
		}else {
			model.addAttribute("msg", "用户名或密码错误！");
			return "login";
		}
	}
}
