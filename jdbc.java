package com.cTesting;
 
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;

import java.sql.Statement;
 
import com.mysql.cj.protocol.Resultset;
 
public class Jdbc {
 
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String url="jdbc:mysql://localhost:3306/omme";

		String username="root";

		String password="Whampx@692";
String query1 =" CREATE TABLE Student (name VARCHAR(100) NOT NULL, id INT NOT NULL, PRIMARY KEY (id));";
String query2="insert into student values('omm',213);";

	//	String display="select * from students";

	//	String delete="delete from student where id=?";

//		String data=rs.getString()

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			System.out.println("Connected to driver successfully");

			Connection con=DriverManager.getConnection(url,username,password);

			System.out.println(con);

			Statement st=con.createStatement();

			PreparedStatement pst=con.prepareStatement(query2);

			//pst.setInt(1,3);

			pst.executeUpdate();

			ResultSet rs=st.executeQuery("Select * from student");

			while(rs.next()) {

				System.out.println(rs.getString("id")+"		"+rs.getString("name")+"		");

			}

		}

		catch(Exception e){

			e.printStackTrace();

		}
 
	}
 
}
