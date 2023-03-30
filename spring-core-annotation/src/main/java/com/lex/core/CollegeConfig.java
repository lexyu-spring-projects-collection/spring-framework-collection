package com.lex.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/30
 */

@Configuration
@ComponentScan(basePackages = "com.lex.core")
// by default, @PropertySource doesn't load YAML files.
@PropertySource(value = {"classpath:college-info.yml"},factory = YamlPropertySourceFactory.class)
public class CollegeConfig {

//	@Bean
//	public Teacher mathTeacherBean() {
//		return new MathTeacher();
//	}

//	@Bean
//	public Principal principalBean() {
//		return new Principal();
//	}

		/*
	@Bean(name = {"colBean", "collegeBeanAnother"})
	public College collegeBean() { // collegeBean - bean id
		College college = new College();
		college.setPrincipal(principalBean());
		college.setTeacher(mathTeacherBean());
		return college;
//		return new College(principalBean());
	}
	 */


}
