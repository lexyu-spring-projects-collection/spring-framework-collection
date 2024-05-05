package com.lex.life.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Lex Yu
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        PersonBean personBean = context.getBean("personBean", PersonBean.class);

        personBean.work();

        context.close();
    }
}
