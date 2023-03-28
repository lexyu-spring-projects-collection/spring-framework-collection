package com.lex.di;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/28
 */
public class Student {
	private int id;
	private String studentName;

	private MathCheat mathCheat;

	public Student() {}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	// spring constructor injection

	public Student(int id) {
		this.id = id;
	}

	public Student(int id, String studentName) {
		System.out.println("Student Constructor called");
		this.id = id;
		this.studentName = studentName;
	}

	// spring setter injection
//	/*
	public void setStudentName(String studentName) {
		this.studentName = studentName;
		System.out.println("Student setter method called : setStudentName");
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Student setter method called : setId");
	}
//	 */

	public void displayStudentInfo() {
		System.out.println("Student name is : " + studentName
		+ ", and the id is : " + id);
	}


	public void cheating(){
		mathCheat.mathCheat();
		System.out.println("Student cheating");
		System.out.println("Hey my id is " + id);
	}
}
