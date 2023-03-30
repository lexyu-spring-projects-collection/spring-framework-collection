package com.lex.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/30
 */
@Component
public class ScienceTeacher implements Teacher {
	@Override
	public void teach() {
		System.out.println("I'm a science teacher");
		System.out.println("My name is Science Teacher");
	}
}
