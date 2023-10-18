package com.lex.repository;

import com.lex.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author : Lex Yu
 */
@Repository
public class ProductRepo {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public ProductRepo(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void saveProduct(Product product) {
		String sql = "INSERT INTO PRODUCT VALUES (?, ?)";

		Object[] args = {product.getId(), product.getName()};

		jdbcTemplate.update(sql, args);

		System.out.println("Saving Products...");
	}

}
