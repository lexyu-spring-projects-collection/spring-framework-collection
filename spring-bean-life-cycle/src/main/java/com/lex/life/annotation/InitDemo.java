package com.lex.life.annotation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/31
 */
@Component
public class InitDemo implements InitializingBean {
	@Autowired
	private Environment env;


	@PostConstruct
	public void postConstruct() {
		System.out.println("InitDemo postConstruct = " + env);
	}

	public void initMethod() {
		System.out.println("InitDemo initMethod = " + env);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitDemo afterPropertiesSet = " + env);

	}
}
