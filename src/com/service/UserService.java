package com.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.po.User;

public interface UserService {

	String register(User buser, Model model, HttpSession session, String code);

	String login(User buser, Model model, HttpSession session, String code, String lastPath);
}
