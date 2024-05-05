package com.lex.life.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author : Lex Yu
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Step 5 - BeanPostProcessor.postProcessBeforeInitialization Method : Bean 至工廠報到");
        System.out.println("Bean : " + bean.toString());
        System.out.println("Bean Name : " + beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("Step 8 - BeanPostProcessor.postProcessAfterInitialization Method : Bean 離開工廠");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
