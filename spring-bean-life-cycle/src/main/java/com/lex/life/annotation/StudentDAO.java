package com.lex.life.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.*;

/**
 * @author : LEX_YU
 * @version : 0.0.1
 * @date : 2023/3/30
 */

@Component("dao")
public class StudentDAO {

	private JDBCconfig jdbc;

	public StudentDAO() {
		System.out.println("StudentDAO empty constructor called");
	}

	@Autowired
	public StudentDAO(JDBCconfig jdbCconfig) {
		this.jdbc = jdbCconfig;
		System.out.println("StudentDAO @Autowired constructor called");
	}

	public void selectAllRows() throws SQLException, ClassNotFoundException {
		jdbc.display();
		try (Connection conn = jdbc.getJDBCConnection()) {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM studnet_cllections.collegestudentinfo;");
			while (rs.next()) {
				int student_id = rs.getInt(1);
				String student_name = rs.getString(2);
				int college_fee = rs.getInt(3);
				String food_type = rs.getString(4);
				System.out.printf("%s, %s, %s, %s\n", student_id, student_name, college_fee, food_type);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void addRow() throws SQLException, ClassNotFoundException {
		jdbc.display();
		try (Connection conn = jdbc.getJDBCConnection();) {
			PreparedStatement pst = conn.prepareStatement("""
					INSERT INTO studnet_cllections.collegestudentinfo(`student_name`, `college_fee`, `food_type`)
					 VALUES ("test", 4321, "noodles");
					""");
			boolean result = pst.execute();
			System.out.println(result);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


	@PostConstruct
	public void daoPostConstruct(){
		System.out.println("StudentDAO @PostConstruct method called");
	}
}
