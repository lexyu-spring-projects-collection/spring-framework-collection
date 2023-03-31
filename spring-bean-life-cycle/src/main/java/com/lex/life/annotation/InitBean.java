package com.lex.life.annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/31
 */
@Configuration
public class InitBean {

	@Bean(initMethod = "initMethod")
	public InitDemo initDemo() {
		return new InitDemo();
	}
}
