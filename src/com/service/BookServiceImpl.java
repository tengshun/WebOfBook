package com.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.dao.BookDao;

@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao bookDao;
	
	@Override
	public String book(Model model, HttpSession session, String isbn) {
		session.setAttribute("book", bookDao.book(isbn));
		return "book";
	}

}
