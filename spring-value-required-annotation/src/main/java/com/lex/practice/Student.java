package com.lex.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.NonNull;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/29
 */
public class Student {
	private String name;
	private String interestedCourse;
	private String hobby;

	public Student() {
	}

//	@Autowired(required = true)
	public Student(String name, String interestedCourse, String hobby) {
		this.name = name;
		this.interestedCourse = interestedCourse;
		this.hobby = hobby;
	}

	//	@Value("Lex @Value")
	@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
	}

	//	@Value("Rust @Value")
	@Value("${student.interestedCourse}")
	public void setInterestedCourse(String interestedCourse) {
		this.interestedCourse = interestedCourse;
	}


	//	@Required // Spring Framework 5.1 Deprecated
//	@Value("Running @Value")
	@Value("${student.hobby}")
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public void displayStudentInfo() {
		System.out.println("Student name " + name);
		System.out.println("Student interested course " + interestedCourse);
		System.out.println("Student hobby " + hobby);
	}
}
