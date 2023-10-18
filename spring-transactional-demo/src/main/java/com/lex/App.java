package com.lex;

import com.lex.config.ProductDataSourceConfig;
import com.lex.service.ProductService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context =
				new AnnotationConfigApplicationContext(ProductDataSourceConfig.class);
		context.registerShutdownHook();

		ProductService productServiceBean = context.getBean("productService", ProductService.class);

		productServiceBean.insertProduct();

		context.close();
	}
}
