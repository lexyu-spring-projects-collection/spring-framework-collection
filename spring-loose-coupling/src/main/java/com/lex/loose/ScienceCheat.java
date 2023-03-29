package com.lex.loose;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class ScienceCheat implements Cheat{

	public ScienceCheat() {
		System.out.println("ScienceCheat constructor called");
	}

//	public void scienceCheat() {
//		System.out.println("ScienceCheat cheating started ...");
//	}

	@Override
	public void cheat() {
		System.out.println("ScienceCheat cheating started ...");
	}
}
