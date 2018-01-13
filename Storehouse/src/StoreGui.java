import java.awt.EventQueue;
import java.sql.*;
import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class StoreGui extends JFrame {

	private JFrame frame;
	private JTextField TF_id;
	private JPasswordField PSWF;
	private JTextField TF_pid1;
	private JTextField TF_pid2;
	private JTextField TF_pidn;
	private JTextField TF_pinfn;
	private JTextField TF_stockn;
	private JTextField TF_stockUpd;
		String role;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StoreGui window = new StoreGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StoreGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel Login_GUI = new JPanel();
		frame.getContentPane().add(Login_GUI, "name_5923233092382");
		Login_GUI.setLayout(null);
	
		JPanel Manager_GUI = new JPanel();
		frame.getContentPane().add(Manager_GUI, "name_5905394140268");
		Manager_GUI.setLayout(null);
		
		JPanel Salesman_GUI = new JPanel();
		frame.getContentPane().add(Salesman_GUI, "name_5907912919917");
		Salesman_GUI.setLayout(null);
		
		JPanel Search_GUI = new JPanel();
		frame.getContentPane().add(Search_GUI, "name_5912612946993");
		Search_GUI.setLayout(null);
		
		JPanel EditStock_GUI = new JPanel();
		frame.getContentPane().add(EditStock_GUI, "name_5914930642289");
		EditStock_GUI.setLayout(null);
		
		JPanel AddNew_GUI = new JPanel();
		frame.getContentPane().add(AddNew_GUI, "name_5927512819686");
		AddNew_GUI.setLayout(null);
		
		
		JLabel LBL_id =new JLabel("ID");
		LBL_id.setBounds(30, 20, 70, 20);
		Login_GUI.add(LBL_id);
		
		JLabel LBL_psw = new JLabel("Password");
		LBL_psw.setBounds(30, 60, 70, 20);
		Login_GUI.add(LBL_psw);
		
		TF_id = new JTextField();
		TF_id.setBounds(110, 20, 150, 20);
		Login_GUI.add(TF_id);
		TF_id.setColumns(10);
		
		PSWF = new JPasswordField();
		PSWF.setBounds(110, 60, 150, 20);
		Login_GUI.add(PSWF);
		
		JButton BTN_login = new JButton("Login");
		BTN_login.setBounds(100, 150, 100, 50);
		Login_GUI.add(BTN_login);
		
		
		TF_pid1 = new JTextField();
		TF_pid1.setBounds(100, 60, 100, 20);
		Manager_GUI.add(TF_pid1);
		TF_pid1.setColumns(10);
		
		JLabel LBL_pid1 = new JLabel("Product ID");
		LBL_pid1.setHorizontalAlignment(SwingConstants.CENTER);
		LBL_pid1.setBounds(100, 20, 100, 20);
		Manager_GUI.add(LBL_pid1);
		
		JButton BTN_search1 = new JButton("Search");
		BTN_search1.setBounds(50, 100, 90, 40);
		Manager_GUI.add(BTN_search1);
		
		JButton BTN_update1 = new JButton("Update");
		BTN_update1.setBounds(160, 100, 90, 40);
		Manager_GUI.add(BTN_update1);
		
		JButton BTN_add = new JButton("Add New");
		BTN_add.setBounds(50, 160, 90, 40);
		Manager_GUI.add(BTN_add);
		
		JButton BTN_statistics = new JButton("Statistics");
		BTN_statistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Featuer Not Yet Implemented","Feature Missing",JOptionPane.ERROR_MESSAGE);
			}
		});
		BTN_statistics.setBounds(160, 160, 90, 40);
		Manager_GUI.add(BTN_statistics);
		
		JButton BTN_barcode1 = new JButton("Barcode");
		BTN_barcode1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Featuer Not Yet Implemented","Feature Missing",JOptionPane.ERROR_MESSAGE);
			}
		});
		BTN_barcode1.setBounds(100, 220, 100, 40);
		Manager_GUI.add(BTN_barcode1);
		
		
		
		JLabel LBL_pid2 = new JLabel("Product ID");
		LBL_pid2.setHorizontalAlignment(SwingConstants.CENTER);
		LBL_pid2.setBounds(100, 20, 100, 20);
		Salesman_GUI.add(LBL_pid2);
		
		TF_pid2 = new JTextField();
		TF_pid2.setBounds(100, 60, 100, 20);
		Salesman_GUI.add(TF_pid2);
		TF_pid2.setColumns(10);
		
		JButton BTN_search2 = new JButton("Search");
		BTN_search2.setBounds(50, 100, 90, 40);
		Salesman_GUI.add(BTN_search2);
		
		JButton BTN_update2 = new JButton("Update");
		BTN_update2.setBounds(160, 100, 90, 40);
		Salesman_GUI.add(BTN_update2);
		
		JButton BTN_barcode2 = new JButton("Barcode");
		BTN_barcode2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Featuer Not Yet Implemented","Feature Missing",JOptionPane.ERROR_MESSAGE);
			}
		});
		BTN_barcode2.setBounds(100, 160, 100, 40);
		Salesman_GUI.add(BTN_barcode2);
		

		
		JButton BTN_update3 = new JButton("Update");
		BTN_update3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		BTN_update3.setBounds(100, 140, 100, 40);
		Search_GUI.add(BTN_update3);
		
		JLabel LBL_pid3 = new JLabel("Product id:");
		LBL_pid3.setFont(new Font("Tahoma", Font.BOLD, 11));
		LBL_pid3.setBounds(50, 20, 90, 20);
		Search_GUI.add(LBL_pid3);
		
		JLabel LBL_pinfo1 = new JLabel("Product info:");
		LBL_pinfo1.setFont(new Font("Tahoma", Font.BOLD, 11));
		LBL_pinfo1.setBounds(50, 60, 90, 20);
		Search_GUI.add(LBL_pinfo1);
		
		JLabel LBL_stock1 = new JLabel("Stock:");
		LBL_stock1.setFont(new Font("Tahoma", Font.BOLD, 11));
		LBL_stock1.setBounds(50, 100, 90, 20);
		Search_GUI.add(LBL_stock1);
		
		JLabel LBL_pidval1 = new JLabel("");
		LBL_pidval1.setBounds(160, 20, 90, 20);
		Search_GUI.add(LBL_pidval1);
		
		JLabel LBL_pinfval1 = new JLabel("");
		LBL_pinfval1.setBounds(160, 60, 90, 20);
		Search_GUI.add(LBL_pinfval1);
		
		JLabel LBL_stockval1 = new JLabel("");
		LBL_stockval1.setBounds(160, 100, 90, 20);
		Search_GUI.add(LBL_stockval1);
		
		JButton BTN_home1 = new JButton("Home");
		BTN_home1.setBounds(100, 191, 100, 40);
		Search_GUI.add(BTN_home1);
		
		
		JButton BTN_updatefinal = new JButton("Confirm");
		BTN_updatefinal.setBounds(100, 140, 100, 40);
		EditStock_GUI.add(BTN_updatefinal);
		
		JLabel LBL_pid4 = new JLabel("Product id:");
		LBL_pid4.setFont(new Font("Tahoma", Font.BOLD, 11));
		LBL_pid4.setBounds(50, 20, 90, 20);
		EditStock_GUI.add(LBL_pid4);
		
		JLabel LBL_pinfo2 = new JLabel("Product info:");
		LBL_pinfo2.setFont(new Font("Tahoma", Font.BOLD, 11));
		LBL_pinfo2.setBounds(50, 60, 90, 20);
		EditStock_GUI.add(LBL_pinfo2);
		
		JLabel LBL_stock2 = new JLabel("Stock:");
		LBL_stock2.setFont(new Font("Tahoma", Font.BOLD, 11));
		LBL_stock2.setBounds(50, 100, 90, 20);
		EditStock_GUI.add(LBL_stock2);
		
		JLabel LBL_pidval2 = new JLabel("");
		LBL_pidval2.setBounds(160, 20, 90, 20);
		EditStock_GUI.add(LBL_pidval2);
		
		JLabel LBL_pinfval2 = new JLabel("");
		LBL_pinfval2.setBounds(160, 60, 90, 20);
		EditStock_GUI.add(LBL_pinfval2);
		
		TF_stockUpd = new JTextField();
		TF_stockUpd.setBounds(160, 100, 90, 20);
		EditStock_GUI.add(TF_stockUpd);
		TF_stockUpd.setColumns(10);
		
		JButton BTN_home2 = new JButton("Home");
		BTN_home2.setBounds(100, 191, 100, 40);
		EditStock_GUI.add(BTN_home2);
		
		
		
		JButton BTN_AddNew = new JButton("Add Product");
		BTN_AddNew.setFont(new Font("Tahoma", Font.PLAIN, 11));
		BTN_AddNew.setBounds(100, 140, 100, 40);
		AddNew_GUI.add(BTN_AddNew);
		
		JLabel lblProductId = new JLabel("Product id:");
		lblProductId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProductId.setBounds(50, 20, 90, 20);
		AddNew_GUI.add(lblProductId);
		
		JLabel lblProductInfo = new JLabel("Product info:");
		lblProductInfo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProductInfo.setBounds(50, 60, 90, 20);
		AddNew_GUI.add(lblProductInfo);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStock.setBounds(50, 100, 90, 20);
		AddNew_GUI.add(lblStock);
		
		TF_pidn = new JTextField();
		TF_pidn.setBounds(160, 20, 90, 20);
		AddNew_GUI.add(TF_pidn);
		TF_pidn.setColumns(10);
		
		TF_pinfn = new JTextField();
		TF_pinfn.setBounds(160, 60, 90, 20);
		AddNew_GUI.add(TF_pinfn);
		TF_pinfn.setColumns(10);
		
		TF_stockn = new JTextField();
		TF_stockn.setBounds(160, 100, 90, 20);
		AddNew_GUI.add(TF_stockn);
		TF_stockn.setColumns(10);
		
		JButton BTN_home3 = new JButton("Home");
		
		BTN_home3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		BTN_home3.setBounds(100, 191, 100, 40);
		AddNew_GUI.add(BTN_home3);
		
		BTN_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					stmt.setString(1,TF_id.getText());
					stmt.setString(2,String.valueOf(PSWF.getPassword()));
					rs=stmt.executeQuery();
					
					if(rs.next()) 
					{
						role=rs.getString("role");
						if (role.equals("admin")) {Login_GUI.setVisible(false);Manager_GUI.setVisible(true);}
						else if (role.equals("sales")) {Login_GUI.setVisible(false);Salesman_GUI.setVisible(true);}
					}else {JOptionPane.showMessageDialog(frame,"Wrong ID or Password please try again","Login Error",JOptionPane.WARNING_MESSAGE);}
				}catch (Exception e1) {e1.printStackTrace();}
				finally
				{
				
					try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				}
			}
		});
		
		BTN_search1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Connection conn=null;
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
				stmt.setString(1,TF_pid1.getText());
				rs=stmt.executeQuery();
				
				if(rs.next()) 
				{
					int pid=rs.getInt("product_id");
					String pinfo=rs.getString("product_info");
					int stock=rs.getInt("stock");
					Manager_GUI.setVisible(false);
					Search_GUI.setVisible(true);
					LBL_pidval1.setText(String.valueOf(pid));
					LBL_pinfval1.setText(pinfo);
					LBL_stockval1.setText(String.valueOf(stock));	
				}else {JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);}
			}catch (Exception e1) {e1.printStackTrace();}
			finally
			{
			
				try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			}
		}
		});
		BTN_search2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {Connection conn=null;
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
				stmt.setString(1,TF_pid2.getText());
				rs=stmt.executeQuery();
				
				if(rs.next()) 
				{
					int pid=rs.getInt("product_id");
					String pinfo=rs.getString("product_info");
					int stock=rs.getInt("stock");
					Salesman_GUI.setVisible(false);
					Search_GUI.setVisible(true);
					LBL_pidval1.setText(String.valueOf(pid));
					LBL_pinfval1.setText(pinfo);
					LBL_stockval1.setText(String.valueOf(stock));	
				}else {JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);}
			}catch (Exception e1) {e1.printStackTrace();}
			finally
			{
			
				try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
			}
		}
		});
		
		BTN_update1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					stmt.setString(1,TF_pid1.getText());
					rs=stmt.executeQuery();
					
					if(rs.next()) 
					{
						int pid=rs.getInt("product_id");
						String pinfo=rs.getString("product_info");
						int stock=rs.getInt("stock");
						Manager_GUI.setVisible(false);
						EditStock_GUI.setVisible(true);
						LBL_pidval2.setText(String.valueOf(pid));
						LBL_pinfval2.setText(pinfo);
						TF_stockUpd.setText(String.valueOf(stock));
					}else {JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);}
				}catch (Exception e1) {e1.printStackTrace();}
				finally
				{
				
					try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				}
			}
			});
		BTN_update2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					stmt.setString(1,TF_pid2.getText());
					rs=stmt.executeQuery();
					
					if(rs.next()) 
					{
						int pid=rs.getInt("product_id");
						String pinfo=rs.getString("product_info");
						int stock=rs.getInt("stock");
						Salesman_GUI.setVisible(false);
						EditStock_GUI.setVisible(true);
						LBL_pidval2.setText(String.valueOf(pid));
						LBL_pinfval2.setText(pinfo);
						TF_stockUpd.setText(String.valueOf(stock));
					}else {JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);}
				}catch (Exception e1) {e1.printStackTrace();}
				finally
				{
				
					try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				}
			}
			});
		BTN_update3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					stmt.setString(1,LBL_pidval1.getText());
					rs=stmt.executeQuery();
					
					if(rs.next()) 
					{
						int pid=rs.getInt("product_id");
						String pinfo=rs.getString("product_info");
						int stock=rs.getInt("stock");
						Search_GUI.setVisible(false);
						EditStock_GUI.setVisible(true);
						LBL_pidval2.setText(String.valueOf(pid));
						LBL_pinfval2.setText(pinfo);
						TF_stockUpd.setText(String.valueOf(stock));
					}else {JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);}
				}catch (Exception e1) {e1.printStackTrace();}
				finally
				{
				
					try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				}
			}
			});
		
		BTN_home1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (role.equals("admin")) {Search_GUI.setVisible(false);Manager_GUI.setVisible(true);}
				else if (role.equals("sales")) {Search_GUI.setVisible(false);Salesman_GUI.setVisible(true);}
			}
		});
		BTN_home2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (role.equals("admin")) {EditStock_GUI.setVisible(false);Manager_GUI.setVisible(true);}
				else if (role.equals("sales")) {EditStock_GUI.setVisible(false);Salesman_GUI.setVisible(true);}
			}
		});
		BTN_home3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (role.equals("admin")) {AddNew_GUI.setVisible(false);Manager_GUI.setVisible(true);}
				else if (role.equals("sales")) {AddNew_GUI.setVisible(false);Salesman_GUI.setVisible(true);}
			}
		});
		
		BTN_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Manager_GUI.setVisible(false);
				AddNew_GUI.setVisible(true);
			}
		});
		
		BTN_updatefinal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
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
					int x = Integer.parseInt(TF_stockUpd.getText());
					int y =Integer.parseInt(LBL_pidval2.getText());
					String sql="UPDATE product"+" SET stock = "+x+" WHERE product_id= "+y;
					stmt.executeUpdate(sql);
				JOptionPane.showMessageDialog(frame,"Product updated");
				EditStock_GUI.setVisible(false);
				Search_GUI.setVisible(true);
				
			}catch (Exception e1) {e1.printStackTrace();}
				finally
				{
				
					try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				}
			}	
		});
		
		BTN_AddNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
					stmt=conn.prepareStatement("INSERT INTO product (product_id,product_info,stock) values(?,?,?);");
					stmt.setInt(1,Integer.parseInt(TF_pidn.getText()));
					stmt.setString(2,TF_pinfn.getText());
					stmt.setInt(3,Integer.parseInt(TF_stockn.getText()));
					stmt.execute();
						
				}catch (Exception e1) {e1.printStackTrace();}
				finally
				{
				
					try { if (rs != null) rs.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (stmt != null) stmt.close(); } catch (SQLException e1) {e1.printStackTrace(); }
					try { if (conn != null) conn.close(); } catch (SQLException e1) {e1.printStackTrace(); }
				}
			}
			});
		
		
	}
}
