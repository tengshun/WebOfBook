package com.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

public interface HomeService {

	public String toRegister(Model model);

	public String toLogin(Model model);

	public String searchBook(Model model, HttpSession session, String bookName, Integer pageCur);

	public String booksdetail(Model model, HttpSession session, String bookAllName);

}
