package com.service;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.po.Answer;
import com.po.ThumbedAnswer;

public interface AnswerService {

	public String showQuestionAndAnswer(int id, Model model, HttpSession session);

	public String addAnswer(Answer answer, Model model, HttpSession session);

	public void answerThumbup(ThumbedAnswer thumbedAnswer, Model model, HttpServletResponse response);

}
