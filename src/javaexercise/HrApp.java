package javaexercise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class HrApp {
	Connection conn;
	
	public static void main(String[] args) {
//		ArrayList<Employees> list = new ArrayList<>();
		System.out.print("Input the Country ID : ");
		Scanner keyboard = new Scanner(System.in);
		String countryId = scan.next();
			
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "password");
		Statement stmt = conn.createStatement();
		stmt.executeQuery("select * from employees");

		HrDataRepo repo = new HrDataRepo();
		repo.initCollection();
		repo.findEmployeeByManagerInCountry();
		ResultSet rs = repo.findEmployeeByManagerInCountry(countryId);
		
		if (rs != null) {
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " + rs.getString("last_name"));
//				System.out.println(" %s %s" rs.getString(1) + "" + rs.getString("last_name"));
				rs.getString(0);
				rs.getString("last_name");
			}
		}
	}

}
