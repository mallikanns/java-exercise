package javaexercise;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MoneyDataRepoTwo {
	// declare connection variable
	Connection conn;
	
	public void initCollection() {
		// initial connection to database
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "password");
		
		
			Statement stmt = conn.createStatement();
			try {
				// check database has moneydata table
				stmt.executeQuery("select * from moneydata");
			} catch (SQLException e) {
				// if not exists, create it
				System.out.println("Create new moneydata table");
				String cr = "create table moneydata(" + "Id int primary key,"
						+ "merchantNumber varchar(200),"
						+ "expFeeNumber varchar(200),"
						+ "fileDate date,"
						+ "repDate date,"
						+ "bankId int,"
						+ "bankName varchar(200),"
						+ "fee double"
						+ ")";
				stmt.executeUpdate(cr);
			}
			stmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void save(MoneyData moneyData) {
		// create insert SQL from moneyData
		String sql = "INSERT INTO moneydata"
				+ "(`Id`,merchantNumber,expFeeNumber, fileDate, repDate, bankId, bankName, fee)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
		
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			//connection.executeUpdate()
			stmt.setInt(1, moneyData.Id);
			stmt.setString(2, moneyData.merchantNumber);
			stmt.setString(3, moneyData.expFeeNumber);
			stmt.setDate(4, Date.valueOf(moneyData.fileDate));
			stmt.setDate(5, Date.valueOf(moneyData.repDate));
			stmt.setInt(6, moneyData.bankId);
			stmt.setString(7, moneyData.bankName);
			stmt.setDouble(8, moneyData.fee);
			
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}

