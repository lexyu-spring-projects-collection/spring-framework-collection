package com.lex.di

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.springframework.context.support.GenericApplicationContext
import org.springframework.context.support.beans

/**
 * @author : Lex Yu
 */


val myBeans = beans {
    bean("dslBean") {
        Student().apply {
            setStudentName("DSL Stu")
            setId(11)
        }
    }

    bean("dslBean2") {
        Student().apply {
            setStudentName("DSL Stu2")
            setId(1111)
        }
    }
}

fun main() {
    // spring
    val context: ApplicationContext = ClassPathXmlApplicationContext("beans.xml")
    println("beans.xml file loaded")
    val student = context.getBean("stu", Student::class.java)
    student.cheating()

    println("=======================================================================")


    // DSL
    val gContext = GenericApplicationContext().apply {
        myBeans.initialize(this)
        println("GenericApplicationContext Beans initialized")
        refresh()
    }


    val dslStu = gContext.getBean("dslBean", Student::class.java)
    val dslStu2 = gContext.getBean("dslBean2", Student::class.java)

    println(dslStu.displayStudentInfo())
    println(dslStu2.displayStudentInfo())

}
