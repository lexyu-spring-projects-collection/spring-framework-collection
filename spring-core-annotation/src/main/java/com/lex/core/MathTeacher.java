package com.lex.core;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/30
 */
@Component
@Primary
public class MathTeacher implements Teacher {
	@Override
	public void teach() {
		System.out.println("I'm a math teacher");
		System.out.println("My name is Math Teacher");
	}
}
