package com.lex.life.annotation;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/31
 */
@Service
public class BeanB {

	@PostConstruct
	private void init() {
		System.out.println("Bean B init method");
	}

	public BeanB() {
		System.out.println("Bean B constructor");
	}

	void testB() {
		System.out.println("Bean B testB method");
	}

	@PreDestroy
	private void endB(){
		System.out.println("Bean B endB method");
	}
}
