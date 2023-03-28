package com.lex.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class Mobile {
	public static void main(String[] args) {

		// use ioc container to create object
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");

		/*
		Cht cht = (Cht) context.getBean("cht");
		cht.calling();
		cht.data();
		 */

		/*
		Phone phone = context.getBean("phone", Phone.class);
		phone.calling();
		phone.data();
		 */

		Home phone = context.getBean("home1", Home.class);
		phone.calling();
		phone.data();

		Home cht = context.getBean("home2", Home.class);
		cht.calling();
		cht.data();

		Home company = context.getBean("home3", Home.class);
		company.calling();
		company.data();

		// Manually
		/*
		Phone phone = new Phone();
		phone.calling();
		phone.data();
		 */

		/*
		Cht cht = new Cht();
		cht.calling();
		cht.data();
		 */

		// The App should be configurable
		/*
		Home home = new Cht();
		home.calling();
		home.data();
		 */


	}
}
