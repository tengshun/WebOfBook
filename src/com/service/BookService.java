package com.service;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

public interface BookService {

	public String book(Model model, HttpSession session, String isbn);

}
