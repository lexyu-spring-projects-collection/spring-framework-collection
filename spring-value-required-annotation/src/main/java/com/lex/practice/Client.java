package com.lex.practice;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/29
 */
public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");

		Student student = context.getBean("student", Student.class);
		student.displayStudentInfo();

	}
}
