package com.lex.life.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/31
 */
@Service
public class BeanA {

	@Autowired
	private BeanB beanB;

	public BeanA() {
		System.out.println("Bean A Constructor");
	}

	@PostConstruct
	private void init() {
		System.out.println("Bean A init method");
		beanB.testB();
	}

	@PreDestroy
	private void endA(){
		System.out.println("Bean A endA method");
	}
}
