package com.lex.ioc;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class Company implements Home{
	@Override
	public void calling() {
		System.out.println("calling using company");
	}

	@Override
	public void data() {
		System.out.println("browsing internet using company");
	}
}
