package com.vaccination.dao;
import java.sql.*;
import java.sql.DriverManager;
public class DatabaseOperations {
	public  static String driver = "com.mysql.jdbc.Driver";
	public  static String url = "jdbc:mysql:///vaccination";
	public static String use = "root";
	public static String pwd = "";
	String INSERT_QU;

	public void Jdbc(String fName, String lName,String mobileNo,String eMail,String password,String gender,String address,String dob) {
		System.out.println(1);
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, use, pwd);
			// Statement st=con.createStatement();
			// int count=st.executeUpdate("");
			PreparedStatement st = con.prepareStatement("insert into registration_page(firstName,lastName,mobileNo,emailId,password,gender,address,dob) values(?,?,?,?,?,?,?,?)");
			if (st != null)
				System.out.println("conncetion");
			st.setString(1, fName);
			st.setString(2, lName);
			st.setString(3, mobileNo);

//			st.setString(4, D_O_B);
			st.setString(4, eMail);
			st.setString(5, password);
			st.setString(6, gender);
			st.setString(7, address);
			st.setString(8,  dob);
			int rows = st.executeUpdate();
			if (rows == 0)
				System.out.println("0 rows");
			else {
				System.out.println("Inserted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void appointment(String AdhaarNo, String Date,String VaccineChoose,String Center) {
		System.out.println(1);
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, use, pwd);
			// Statement st=con.createStatement();
			// int count=st.executeUpdate("");
			PreparedStatement st = con.prepareStatement("insert into appointment_page(adhaarNo,date,vaccionChoose,center) values(?,?,?,?)");
			if (st != null)
				System.out.println("conncetion");
			st.setString(1, AdhaarNo);
			st.setString(2, Date);
			st.setString(3, VaccineChoose);

//			st.setString(4, D_O_B);
			st.setString(4, Center);
			int rows = st.executeUpdate();
			if (rows == 0)
				System.out.println("0 rows");
			else {
				System.out.println("Inserted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void Vaccine_Stock(String Covaxin, String Covidshield) {
		System.out.println(1);
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, use, pwd);
			// Statement st=con.createStatement();
			// int count=st.executeUpdate("");
			PreparedStatement st = con.prepareStatement("insert into vaccine_stock(covaxin, covidshield) values(?,?)");
			if (st != null)
				System.out.println("conncetion");
			st.setString(1, Covaxin);
			st.setString(2, Covidshield);
			int rows = st.executeUpdate();
			if (rows == 0)
				System.out.println("0 rows");
			else {
				System.out.println("Inserted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
	