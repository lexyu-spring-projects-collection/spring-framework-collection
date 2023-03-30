package com.lex.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/30
 * `@Component`
 * <bean id="collegeBean" class="com.lex.core.College"></bean>
 */
@Component
public class College {

//	@Value("This is @Value College Name")
	@Value("${college.name}")
	private String collegeName;

//	@Autowired
	private Principal principal;

//	@Autowired

	private Teacher teacher;

	public College() {}

	/*
	public College(Principal principal) {
		this.principal = principal;
	}
	 */

	@Autowired
	@Qualifier("scienceTeacher")
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
		System.out.println("using setTeacher method");
	}
	@Autowired
	public void setPrincipal(Principal principal) {
		this.principal = principal;
		System.out.println("using setPrincipal method");
	}

	public void test() {
		principal.showInfo();
		teacher.teach();
		System.out.println("My college name is : " + collegeName);
		System.out.println("testing this methods");
	}
}
