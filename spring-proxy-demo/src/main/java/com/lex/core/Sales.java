package com.lex.core;

import java.math.BigDecimal;

/**
 * @author : Lex Yu
 * @version : 0.0.1
 * @date : 2023/5/15
 */
public interface Sales {
	BigDecimal doSale(BigDecimal amount) throws Exception;
}
