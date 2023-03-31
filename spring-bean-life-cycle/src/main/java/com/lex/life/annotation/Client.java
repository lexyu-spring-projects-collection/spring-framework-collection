package com.lex.life.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.sql.SQLException;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/31
 */
@Configuration
@PropertySource(value = {"classpath:database.yml"}, factory = YamlPropertySourceFactory.class)
public class Client {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		ApplicationContext context = new AnnotationConfigApplicationContext(JDBCconfig.class, StudentDAO.class);
		StudentDAO dao = context.getBean("dao", StudentDAO.class);
		dao.selectAllRows();
//		dao.addRow();
		((AnnotationConfigApplicationContext)context).close();
	}
}
