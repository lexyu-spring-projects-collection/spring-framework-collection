package com.lex.ioc;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class Phone implements Home {

	public Phone() {
		System.out.println("Phone constructor called");
	}

	@Override
	public void calling() {
		System.out.println("calling using iphone mobile");
	}

	@Override
	public void data() {
		System.out.println("browsing internet using iphone");
	}
}
