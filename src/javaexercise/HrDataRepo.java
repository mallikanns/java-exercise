package javaexercise;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HrDataRepo {
	// declare connection variable
	Connection conn;
	
	public void initCollection() {
		// initial connection to database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "password");
		
			Statement stmt = conn.createStatement();
			stmt.executeQuery("select * from moneydata");
			
			stmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ResultSet findEmployeeByManagerInCountry(String countryId) {
		String sql = "";
//		""" """
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, countryId);
			return stmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

}

