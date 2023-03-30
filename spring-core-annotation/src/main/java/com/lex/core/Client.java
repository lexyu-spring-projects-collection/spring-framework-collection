package com.lex.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/30
 */
public class Client {
	public static void main(String[] args) {
		// XML
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");
		College college = context.getBean("collegeBean", College.class);
		System.out.println("The college object created by spring is : " + college);
		 */

		// Annotation
		ApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college = context.getBean("college", College.class);
		System.out.println("The college object created by spring is : " + college);
		college.test();

		((AnnotationConfigApplicationContext)context).close();
	}
}
