package com.lex.life.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/30
 */

@ComponentScan
public class JDBCconfig {
	@Value("${jdbc.username}")
	public String username;
	@Value("${jdbc.password}")
	public String password;
	@Value("${jdbc.url}")
	public String url;
	@Value("${jdbc.driver}")
	public String driver;

	public void display() {
		System.out.printf("""
						username: %s
						password: %s
						url: %s
						driver: %s
										""",
				username, password, url, driver);
	}

	public Connection getJDBCConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successfully : " + conn);
		return conn;
	}
}
