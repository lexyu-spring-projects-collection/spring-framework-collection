package com.lex.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class Client {
	public static void main(String[] args) {
		// spring
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		Student student = context.getBean("stu",Student.class);
		student.cheating();

		Friend friend = context.getBean("friend", Friend.class);
		friend.startCheating();

		// manually
		/*
		Student student = new Student();
		MathCheat mathCheat = new MathCheat();
		student.setMathCheat(mathCheat);
		student.cheating();
		 */
	}
}
