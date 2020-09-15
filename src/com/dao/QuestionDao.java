package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.Question;

@Repository("questionDao")
@Mapper
public interface QuestionDao {

	public List<Question> selectQuestion(Map<String, Object> map);

	public int addQuestion(Question question);

	public Object allPageQuestion(int page_id);

	public Question selectQuestionById(int id);

}
