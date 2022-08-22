package Dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDao {
	String url ="jdbc:mysql://localhost:3306/phase2db";
	String username="root";
	String password="root";
	String sql = "select * from user where email=? and password=?";
	
	public boolean check(String email, String pass){
		boolean flag =false;
		
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url,username,password);
			
			PreparedStatement st = con.prepareStatement(sql);
			
			
			st.setString(1, email);
			st.setString(2, pass);
			
			
			ResultSet rs = st.executeQuery();
			
			if(rs.next()){
				flag =true;
				return flag;
			}	
			
		} catch (Exception e) {
		
			e.printStackTrace();
		}	
		
		return flag;	
	}
}