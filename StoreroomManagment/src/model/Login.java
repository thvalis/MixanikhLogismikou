package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Login {
	
	private String role;
	private int id;
	private String pass;
	
	public void loging(int id,String pass) {
		this.id=id;
		this.pass=pass;
		Connection conn=null;
		PreparedStatement stmt =null;
		ResultSet rs=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl = "jdbc:mysql://127.0.0.1:3306/stockhousedb";
			String connectionUser = "root";
			String connectionPassword = "thanasis";
			conn= DriverManager.getConnection(connectionUrl,connectionUser,connectionPassword);
			stmt=conn.prepareStatement("SELECT role FROM user WHERE user_id=? AND password=?");
			stmt.setInt(1,id);
			stmt.setString(2,String.valueOf(pass));
			rs=stmt.executeQuery();
			
			if(rs.next()) 
			{role=rs.getString("role");}else {role="no";}
		}catch (Exception e1) {e1.printStackTrace();}
		finally
		{
		
			try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
		}
	}

	
	public String returnRole() {
		return role;
	}

}
