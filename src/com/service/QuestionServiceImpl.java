package com.service;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.dao.QuestionDao;
import com.po.Book;
import com.po.Question;

import util.MyUtil;
@Service("questionService")
@Transactional
public class QuestionServiceImpl implements QuestionService{
	@Autowired
	private QuestionDao questionDao;
	
	@Override
	public String selectQuestion(Model model, HttpSession session, String order, Integer page) {
		Map<String, Object> map = new HashMap<String, Object>();
		String isbn = ((Book) session.getAttribute("book")).getIsbn();
		map.put("isbn", isbn);
		map.put("order", order);
		map.put("page", page);
		System.out.println(map.toString());
		model.addAttribute("questionList", questionDao.selectQuestion(map));
		if (page != null) {
			model.addAttribute("page", page);
			return "pageQuestion";
		} else {
			return "question";
		}
	}
	
	@Override
	public String ask(Question question, Model model, HttpSession session) {
		question.setUser_id(MyUtil.getUserId(session));
		Integer n = questionDao.addQuestion(question);
		if (n != null && n > 0) {
			return "questionSubmitSuccess";
		}else {
			model.addAttribute("msg", "提交失败！");
			return "questionEdit";
		}
	}
	@Override
	public String searchQuestion(Question question, Model model) {
		model.addAttribute("questionList", questionDao.allPageQuestion(question.getPage()));
		return "";
	}
}
