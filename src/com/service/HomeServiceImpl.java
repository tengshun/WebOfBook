package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;

import com.dao.BookDao;

@Service("homeService")
@Transactional
public class HomeServiceImpl implements HomeService{
	
	@Autowired
	private BookDao bookDao;

	@Override
	public String toRegister(Model model) {
		return "register";
	}

	@Override
	public String toLogin(Model model) {
		return "login";
	}

	@Override
	public String searchBook(Model model,HttpSession session,String bookName,Integer pageCur) {
		session.setAttribute("bookName", bookName);
		int temp = bookDao.bookCount(bookName);
		model.addAttribute("totalCount", temp);
		int totalPage = 0;
		if (temp==0) {
			totalPage=0;
		}else {
			totalPage = (int)Math.ceil((double)temp / 10);
		}
		if (pageCur==null) {
			pageCur = 1;
		}
		if ((pageCur-1) * 10 > temp) {
			pageCur = pageCur - 1;
		}
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bookName", bookName);
		map.put("startIndex", (pageCur - 1) * 10 );
		map.put("perPageSize", 10);
		List<Map<String, Object>> books = bookDao.searchBookByPage(map);
		model.addAttribute("books", books);
		model.addAttribute("totalPage", totalPage);
		model.addAttribute("pageCur", pageCur);
		
		return "result";
	}

	@Override
	public String booksdetail(Model model, HttpSession session, String bookAllName) {
		model.addAttribute("booksdetail", bookDao.booksdetail(bookAllName));
		return "booksdetail";
	}
	
}

