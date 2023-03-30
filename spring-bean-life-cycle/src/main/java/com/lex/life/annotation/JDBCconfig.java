package com.lex.life.annotation;

import org.springframework.beans.factory.annotation.Value;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/30
 */
public class JDBCconfig {

	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.driver}")
	private String driver;

	public void display() {
		System.out.printf("""
						username: %s
						password: %s
						url: %s
						driver: %s
										""",
				username, password, url, driver);
	}

	public void getJDBCConnection() throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Connection Successfully : " + conn);
	}
}
