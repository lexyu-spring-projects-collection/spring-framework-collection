package com.lex.ioc;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class Cht implements Home{

	public Cht() {
		System.out.println("Cht constructor called");
	}

	@Override
	public void calling() {
		System.out.println("calling using cht mobile");
	}

	@Override
	public void data() {
		System.out.println("browsing internet using cht");
	}
}
