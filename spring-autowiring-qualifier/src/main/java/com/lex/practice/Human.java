package com.lex.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/29
 */
public class Human {
//	@Autowired
//	@Qualifier(value = "humanHeart")
	private Heart heart;

	public Human() {
	}

	@Autowired
	public Human(@Qualifier("octopusHeart") Heart heart) {
		System.out.println("Constructor method called");
		this.heart = heart;
	}

//	@Autowired
//	@Qualifier(value = "humanHeart")
	public void setHeart(Heart heart) {
		this.heart = heart;
		System.out.println("Setter method called");
	}

	public void startPumping() {
		if (heart != null) {
			heart.pump();
			System.out.println("name of the animal is : " + heart.getNameOfAnimal() +
					", no of heart present : " + heart.getNoOfHeart());
		} else {
			System.out.println("you are dead");
		}
	}
}
