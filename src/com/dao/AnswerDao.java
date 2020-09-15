package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.Answer;
import com.po.Question;

@Repository("answerDao")
@Mapper
public interface AnswerDao {

	public List<Question> selectAnswers(Map<String, Object> map);

	public int addAnswer(Answer answer);

	public int updateThumb(int answer_id);

}
