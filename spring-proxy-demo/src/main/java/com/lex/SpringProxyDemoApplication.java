package com.lex;

import com.lex.core.Salesman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@SpringBootApplication
public class SpringProxyDemoApplication {
	@Bean
	public Salesman salesman(){
		return new Salesman();
	}

	@GetMapping("/sale")
	public void sale() throws Exception {
		salesman().doSale(new BigDecimal(1000));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringProxyDemoApplication.class, args);
	}

}
