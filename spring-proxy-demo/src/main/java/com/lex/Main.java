package com.lex;

import com.lex.java_dynamic_proxy.SalesInvocationHandler;
import com.lex.core.Sales;
import com.lex.static_proxy.SalesLiveLog;
import com.lex.core.Salesman;

import java.math.BigDecimal;

/**
 * @author : Lex Yu
 * @version : 0.0.1
 * @date : 2023/5/15
 */
public class Main {
	public static void main(String[] args) throws Exception {
		// static proxy
		Sales sales = new SalesLiveLog(new Salesman());
		sales.doSale(new BigDecimal(1000));
		System.out.println("----------------------------------------------------------------");
		// java dynamic proxy (reflection)
		SalesInvocationHandler handler = new SalesInvocationHandler(new Salesman());
		Sales sales1 = handler.createProxy();
		sales1.doSale(new BigDecimal(1000));
	}
}
