package com.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.po.Question;

public interface QuestionService {

	public String selectQuestion(Model model, HttpSession session, String order,Integer page);

	public String ask(Question question, Model model, HttpSession session);

	public String searchQuestion(Question question, Model model);
}
