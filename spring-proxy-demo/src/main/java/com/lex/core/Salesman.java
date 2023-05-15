package com.lex.core;

import java.math.BigDecimal;

/**
 * @author : Lex Yu
 * @version : 0.0.1
 * @date : 2023/5/15
 */
public class Salesman implements Sales {

	private final BigDecimal productAmount = BigDecimal.valueOf(150.75);


	@Override
	public BigDecimal doSale(BigDecimal amount) throws Exception {
		if (amount == null) {
			throw new RuntimeException("Not enough money");
		}
		if (productAmount.compareTo(amount) <= 0) {
			return amount.subtract(productAmount);
		} else {
			throw new Exception("Not enough money");
		}
	}
}
