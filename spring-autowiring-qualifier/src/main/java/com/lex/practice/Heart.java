package com.lex.practice;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/29
 */
public class Heart {
	private String nameOfAnimal;
	private int noOfHeart;

	public Heart() {
	}

	public Heart(String nameOfAnimal, int noOfHeart) {
		this.nameOfAnimal = nameOfAnimal;
		this.noOfHeart = noOfHeart;
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	public int getNoOfHeart() {
		return noOfHeart;
	}

	public void setNoOfHeart(int noOfHeart) {
		this.noOfHeart = noOfHeart;
	}

	public void pump() {
		System.out.println("your heart is pumping...");
		System.out.println("Alive");
	}
}
