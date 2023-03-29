package com.lex.loose;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class JavaCheat implements Cheat {

	public JavaCheat() {
		System.out.println("JavaCheat constructor called");
	}

	@Override
	public void cheat() {
		System.out.println("Java cheating started ...");
	}
}
