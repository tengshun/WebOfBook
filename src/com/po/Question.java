package com.po;

import java.sql.Date;
import java.sql.Time;

public class Question {
	 private int id;
	 private String questiontitle;
	 private String questionsupplement;
	 private int click;
	 private String book_isbn;
	 private int page;
	 private int user_id;
	 private String createtime;
	public int getId() {
		return id;
	}
	public String getQuestiontitle() {
		return questiontitle;
	}
	public String getQuestionsupplement() {
		return questionsupplement;
	}
	public int getClick() {
		return click;
	}
	public String getBook_isbn() {
		return book_isbn;
	}
	public int getPage() {
		return page;
	}
	public int getUser_id() {
		return user_id;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setQuestiontitle(String questiontitle) {
		this.questiontitle = questiontitle;
	}
	public void setQuestionsupplement(String questionsupplement) {
		this.questionsupplement = questionsupplement;
	}
	public void setClick(int click) {
		this.click = click;
	}
	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
}
