package com.po;

import java.sql.Date;

public class Answer {
	private int id;
	private String value;
	private int thumbup;
	private double quanlity;
	private int question_id;
	private int user_id;
	private Date createtime;
	public int getId() {
		return id;
	}
	public String getValue() {
		return value;
	}
	public int getThumbup() {
		return thumbup;
	}
	public double getQuanlity() {
		return quanlity;
	}
	public int getQuestion_id() {
		return question_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public Date getCreatetime() {
		return createtime;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void setThumbup(int thumbup) {
		this.thumbup = thumbup;
	}
	public void setQuanlity(double quanlity) {
		this.quanlity = quanlity;
	}
	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
}
