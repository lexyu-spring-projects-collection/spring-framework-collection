# Order
```markdown
Step 1 - Constructor Init
Step 2 - Set Property : Lex
Step 3 - Call BeanNameAware.setBeanName Method : 設定 Bean Name
Step 4 - Call BeanFactoryAware.setBeanFactory Method : 選擇 Bean 工廠
Step 5 - BeanPostProcessor.postProcessBeforeInitialization Method : Bean 至工廠報到
Step 6 - InitializingBean.afterPropertiesSet Method : Bean 註冊
Step 7 - Custom init Method : Working!!
Step 8 - BeanPostProcessor.postProcessAfterInitialization Method : Bean 離開工廠
work Method : Bean is being used
Step 9 - DisposableBean.destroy Method : 銷毀 Bean
Step 10 - Custom destroy Method : >>>>><<<<< 
```
