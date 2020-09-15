package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.Book;

@Repository("bookDao")
@Mapper
public interface BookDao {

	public Book book(String isbn);

	public int bookCount(String bookName);
	
	public List<Map<String, Object>> searchBookByPage(Map<String, Object> map);

	public List<Book> booksdetail(String bookAllName);
}
