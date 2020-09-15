package com.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Question;
import com.service.QuestionService;

@Controller
public class QuestionController extends BaseController{
	@Autowired
	private QuestionService questionService;
	@RequestMapping("/toAsk")
	public String toAsk(Model model, HttpSession session) {
		model.addAttribute("question", new Question());
		return "questionEdit";
	}
	
	@RequestMapping("/ask")
	public String ask(@ModelAttribute Question question,Model model, HttpSession session) {
		return questionService.ask(question, model, session);
	}
	
	@RequestMapping("/searchQuestion")
	public String searchQuestion(@ModelAttribute Question question,Model model) {
		return questionService.searchQuestion(question, model);
	}
}
