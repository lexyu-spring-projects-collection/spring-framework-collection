package com.lex.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class Exam {
	public static void main(String[] args) {
		// Spring
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();

		Student lex = context.getBean("lex", Student.class);
		lex.displayStudentInfo();

//		Student copy = context.getBean("copy", Student.class);
//		copy.displayStudentInfo();


		// manually
		/*
		Student student = new Student();
		student.setStudentName("Lex");
		student.displayStudentInfo();

		Student s = new Student(1, "L");
		s.displayStudentInfo();
        */

	}
}
