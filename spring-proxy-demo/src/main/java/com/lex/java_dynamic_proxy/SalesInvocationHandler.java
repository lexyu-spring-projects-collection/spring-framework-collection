package com.lex.java_dynamic_proxy;

import com.lex.core.Sales;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;

/**
 * @author : Lex Yu
 * @version : 0.0.1
 * @date : 2023/5/15
 */
public class SalesInvocationHandler implements InvocationHandler {
	private final Sales sales;

	public SalesInvocationHandler(Sales sales) {
		this.sales = sales;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("sales will received $" + args[0].toString());
		BigDecimal result = (BigDecimal) method.invoke(sales, args);
		System.out.println("sales return $" + result.toPlainString());
		return result;
	}

	public Sales createProxy() {
		return (Sales) Proxy.newProxyInstance
				(sales.getClass().getClassLoader(), sales.getClass().getInterfaces(), this::invoke);
	}
}
