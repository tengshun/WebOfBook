package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("/home")
	public String home(Model model, HttpSession session) {
		return "home";
	}
	
	@RequestMapping("/toFeedback")
	public String toFeedBack(Model model, HttpSession session) {
		return "feedback";
	}
	
	@RequestMapping("/toRegister")
	public String toRegister(Model model) {
		return homeService.toRegister(model);
	}
	
	@RequestMapping("/toLogin")
	public String toLogin(Model model) {
		return homeService.toLogin(model);
	}
	
	@RequestMapping("/searchBook")
	public String searchBook(Model model, HttpSession session, String bookName,Integer pageCur) {
		return homeService.searchBook(model,session,bookName,pageCur);
	}
	
	@RequestMapping("/booksdetail")
	public String booksdetail(Model model, HttpSession session, String bookAllName) {
		return homeService.booksdetail(model,session,bookAllName);
	}
}
