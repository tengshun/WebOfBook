package com.po;

import java.sql.Date;

public class Book {
	 private String isbn;
	 private String title;
	 private int edition;
	 private String author;
	 private String others;
	 private String otherswork;
	 private String presslocation;
	 private String press;
	 private Date pressdate;
	 private float price;
	 private String notions;
	 private String language;
	 private int numquestion;
	 private int numbookcomment;
	 private int nummaterial;
	 private int allscore;
	 private int numscorer;
	 private float score;
	public String getIsbn() {
		return isbn;
	}
	public String getTitle() {
		return title;
	}
	public int getEdition() {
		return edition;
	}
	public String getAuthor() {
		return author;
	}
	public String getOthers() {
		return others;
	}
	public String getOtherswork() {
		return otherswork;
	}
	public String getPresslocation() {
		return presslocation;
	}
	public String getPress() {
		return press;
	}
	public Date getPressdate() {
		return pressdate;
	}
	public float getPrice() {
		return price;
	}
	public String getNotions() {
		return notions;
	}
	public String getLanguage() {
		return language;
	}
	public int getNumquestion() {
		return numquestion;
	}
	public int getNumbookcomment() {
		return numbookcomment;
	}
	public int getNummaterial() {
		return nummaterial;
	}
	public int getAllscore() {
		return allscore;
	}
	public int getNumscorer() {
		return numscorer;
	}
	public float getScore() {
		return score;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setEdition(int edition) {
		this.edition = edition;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setOthers(String others) {
		this.others = others;
	}
	public void setOtherswork(String otherswork) {
		this.otherswork = otherswork;
	}
	public void setPresslocation(String presslocation) {
		this.presslocation = presslocation;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public void setPressdate(Date pressdate) {
		this.pressdate = pressdate;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setNotions(String notions) {
		this.notions = notions;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public void setNumquestion(int numquestion) {
		this.numquestion = numquestion;
	}
	public void setNumbookcomment(int numbookcomment) {
		this.numbookcomment = numbookcomment;
	}
	public void setNummaterial(int nummaterial) {
		this.nummaterial = nummaterial;
	}
	public void setAllscore(int allscore) {
		this.allscore = allscore;
	}
	public void setNumscorer(int numscorer) {
		this.numscorer = numscorer;
	}
	public void setScore(float score) {
		this.score = score;
	}
}
