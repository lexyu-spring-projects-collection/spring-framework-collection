package com.lex.di;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class Friend {
	private MathCheat cheat;

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

	public void startCheating() {
		cheat.mathCheat();
	}
}
