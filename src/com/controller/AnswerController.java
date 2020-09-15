package com.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.po.Answer;
import com.po.ThumbedAnswer;
import com.service.AnswerService;

@Controller
public class AnswerController extends BaseController{
	
	@Autowired
	private AnswerService answerService;
	
	@RequestMapping("/showQuestionAndAnswer")
	public String showQuestionAndAnswer(int id, Model model, HttpSession session) {//id必须与请求参数名保持一致
		model.addAttribute("answer", new Answer());
		return answerService.showQuestionAndAnswer(id, model,session);
	}
	
	@RequestMapping("/addAnswer")
	public String addAnswer(Answer answer, Model model, HttpSession session) {
		return answerService.addAnswer(answer, model, session);
	}
	
	@RequestMapping("/answerThumbup")
	public void answerThumbup(ThumbedAnswer thumbedAnswer, Model model, HttpServletResponse response) {
		System.out.println("回答id " + thumbedAnswer.getAnswer_id() + "用户id " + thumbedAnswer.getUser_id());
		answerService.answerThumbup(thumbedAnswer, model, response);
	}
}
