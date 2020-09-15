package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.BookService;
import com.service.QuestionService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	@Autowired
	private QuestionService questionService;
	
	@RequestMapping("/book")
	public String book(Model model, HttpSession session, String isbn) {
		return bookService.book(model,session,isbn);
	}
	
	@RequestMapping("/loadQuestion")
	public String loadQuestion(Model model, HttpSession session, String order, String page) {
		return questionService.selectQuestion(model,session,order,Integer.getInteger(page));
	}
	
	@RequestMapping("/loadPageQuestion")
	public String loadPageQuestion(Model model, HttpSession session, String isbn, String page, String order) {
		return questionService.selectQuestion(model,session,order,Integer.parseInt(page));
	}
}
