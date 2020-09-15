package com.po;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//该类与本项目无关，只是用于解读Spring源码
public class Test {
	 ApplicationContext appCon = new ClassPathXmlApplicationContext("abc.xml");
}
