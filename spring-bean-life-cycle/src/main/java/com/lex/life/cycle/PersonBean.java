package com.lex.life.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @author : Lex Yu
 */
public class PersonBean implements InitializingBean, BeanFactoryAware, BeanNameAware, DisposableBean {
    private Long personId;
    private String name;

    // 實例化
    public PersonBean() {
        System.out.println("Step 1 - Constructor Init");
    }

    public PersonBean(Long personId, String name) {
        this.personId = personId;
        this.name = name;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Step 2 - Set Property : " + name);
    }

    // 初始化
    public void init() {
        System.out.println("Step 7 - Custom init Method : Working!!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Step 4 - Call BeanFactoryAware.setBeanFactory Method : 選擇 Bean 工廠");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Step 3 - Call BeanNameAware.setBeanName Method : 設定 Bean Name");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Step 9 - DisposableBean.destroy Method : 銷毀 Bean ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Step 6 - InitializingBean.afterPropertiesSet Method : Bean 註冊");
    }

    public void destroyMethod() {
        System.out.println("Step 10 - Custom destroy Method : >>>>><<<<< ");
    }

    public void work(){
        System.out.println("work Method : Bean is being used");
    }
}
