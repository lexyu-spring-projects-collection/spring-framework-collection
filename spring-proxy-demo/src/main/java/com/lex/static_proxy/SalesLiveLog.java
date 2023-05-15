package com.lex.static_proxy;

import com.lex.core.Sales;
import com.lex.core.Salesman;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

/**
 * @author : Lex Yu
 * @version : 0.0.1
 * @date : 2023/5/15
 */
public class SalesLiveLog implements Sales {
	private final static Logger log = LoggerFactory.getLogger(SalesLiveLog.class);

	private final Salesman salesman;

	public SalesLiveLog(Salesman salesman) {
		this.salesman = salesman;
	}

	@Override
	public BigDecimal doSale(BigDecimal amount) throws Exception {
		log.info("Sales will received ${}", amount.toPlainString());
		BigDecimal result = salesman.doSale(amount);
		log.info("sales return $ {}", result.toPlainString());

		return result;
	}
}
