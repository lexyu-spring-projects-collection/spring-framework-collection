package com.lex.loose;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class Student {
	private Cheat cheat;

	public void setCheat(Cheat cheat) {
		this.cheat = cheat;
	}

	public void startCheating() {
		cheat.cheat();
	}
}
