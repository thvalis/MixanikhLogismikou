package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




public class Product {
	
	private String pinfo=null;
	private int pid=02;
	private int stock=03;
	private int existflag=0;
		
	public int productSearch(int pid)
		{
		this.pid=pid;
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
			stmt=conn.prepareStatement("SELECT * FROM product WHERE product_id=?");
			stmt.setInt(1,pid);
			rs=stmt.executeQuery();
			
			if(rs.next()) 
				{
					pid=rs.getInt("product_id");
					pinfo=rs.getString("product_info");
					stock=rs.getInt("stock");
					return 1;
				}
			else
				{
					return 0;
				}
		}catch (Exception e1) {e1.printStackTrace();}
		finally
		{
		
			try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
		}
		return 0;
		}
	
	public int productUpd(int pid,int stock) {
		this.pid=pid;
		this.stock=stock;
		
		Connection conn=null;
		Statement stmt =null;
		ResultSet rs=null;
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl = "jdbc:mysql://127.0.0.1:3306/stockhousedb";
			String connectionUser = "root";
			String connectionPassword = "thanasis";
			conn= DriverManager.getConnection(connectionUrl,connectionUser,connectionPassword);
			stmt=conn.createStatement();
			String sql="UPDATE product"+" SET stock = "+stock+" WHERE product_id= "+pid;
			stmt.executeUpdate(sql);
			return 1;
	}catch (Exception e1) {e1.printStackTrace();}
		finally
		{
		
			try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
		}
		return 0;}

	public int productNew(int pid,String pinfo,int stock) {
		this.pid=pid;
		this.stock=stock;
		this.pinfo=pinfo;
		Connection conn=null;
		PreparedStatement stmt =null;
		ResultSet rs=null;
		try
		{
			existflag=productSearch(pid);
			if (existflag==1) {return 0;}
			else {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			String connectionUrl = "jdbc:mysql://127.0.0.1:3306/stockhousedb";
			String connectionUser = "root";
			String connectionPassword = "thanasis";
			conn= DriverManager.getConnection(connectionUrl,connectionUser,connectionPassword);
			stmt=conn.prepareStatement("INSERT INTO product (product_id,product_info,stock) values(?,?,?);");
			stmt.setInt(1,pid);
			stmt.setString(2,pinfo);
			stmt.setInt(3,stock);
			stmt.execute();
			return 1;}
		}catch (Exception e1) {e1.printStackTrace();}
		finally
		{
		
			try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
		}
		
		
		return 0;}
	
	
	
	public int productRetpid(){return pid;}
	public String productRetpinf() {return pinfo;}
	public int productRetstck() {return stock;}

	

}
