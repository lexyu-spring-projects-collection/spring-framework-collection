package com.lex.loose;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 * create an interface
 */
public class Client {
	public static void main(String[] args) {
		// spring
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		Student student = context.getBean("stu",Student.class);
		student.startCheating();
	}
}
