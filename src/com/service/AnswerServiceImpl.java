package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.dao.AnswerDao;
import com.dao.QuestionDao;
import com.dao.ThumbedAnswerDao;
import com.dao.UserDao;
import com.po.Answer;
import com.po.Question;
import com.po.ThumbedAnswer;

import util.MyUtil;

@Service("answerService")
@Transactional
public class AnswerServiceImpl implements AnswerService{
	
	@Autowired
	QuestionDao questionDao;
	@Autowired
	AnswerDao answerDao;
	@Autowired
	UserDao userDao;
	@Autowired
	ThumbedAnswerDao thumbedAnswerDao;

	@Override
	public String showQuestionAndAnswer(int id, Model model, HttpSession session) {
		//问题
		model.addAttribute("question", questionDao.selectQuestionById(id));
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("question_id", id);
		List<Question> list = answerDao.selectAnswers(map);
		//回答
		model.addAttribute("answers", list);
		model.addAttribute("answer_num", list.size());//共有多少条回答
		//提问者
		model.addAttribute("user", userDao.selectUserById(MyUtil.getUserId(session)));
		return "questionAndAnswer";
	}

	@Override
	public String addAnswer(Answer answer, Model model, HttpSession session) {
		answer.setUser_id(MyUtil.getUserId(session));
		answerDao.addAnswer(answer);
		//添加回答后刷新问题及其回答
		return showQuestionAndAnswer(answer.getQuestion_id(), model, session);
	}

	@Override
	public void answerThumbup(ThumbedAnswer thumbedAnswer, Model model, HttpServletResponse response) {
		ThumbedAnswer thumbed = thumbedAnswerDao.selectThumb(thumbedAnswer);
		if(thumbed != null && thumbed.getThumb() > 0) {
			response.setStatus(403);
		}else {
			thumbedAnswerDao.thumb(thumbedAnswer);//标记该用户已点赞过该回答
			answerDao.updateThumb(thumbedAnswer.getAnswer_id());
			response.setStatus(200);
		}
	}

}
