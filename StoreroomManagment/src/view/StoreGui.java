package view;

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

import model.Login;
import model.Product;

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
		int retf,retf1;
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
	public void initialize() {
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
				JOptionPane.showMessageDialog(frame,"Feature Not Yet Implemented","Feature Missing",JOptionPane.ERROR_MESSAGE);
			}
		});
		BTN_statistics.setBounds(160, 160, 90, 40);
		Manager_GUI.add(BTN_statistics);
		
		JButton BTN_barcode1 = new JButton("Barcode");
		BTN_barcode1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Feature Not Yet Implemented","Feature Missing",JOptionPane.ERROR_MESSAGE);
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
				JOptionPane.showMessageDialog(frame,"Feature Not Yet Implemented","Feature Missing",JOptionPane.ERROR_MESSAGE);
			}
		});
		BTN_barcode2.setBounds(100, 160, 100, 40);
		Salesman_GUI.add(BTN_barcode2);
		

		
		JButton BTN_update3 = new JButton("Update");
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
		
		BTN_login.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e) 
					{
						int id = Integer.parseInt(TF_id.getText());
						String pass = String.valueOf(PSWF.getPassword());
						Login login = new Login();
						login.Loging(id,pass);
						role=login.ReturnRole();
						if (role.equals("admin")) 
							{
								Login_GUI.setVisible(false);
								Manager_GUI.setVisible(true);
							}
						else if (role.equals("sales")) 
							{
								Login_GUI.setVisible(false);
								Salesman_GUI.setVisible(true);
							}
						else if (role.equals("no")) 
							{
								JOptionPane.showMessageDialog(frame,"Wrong ID or Password please try again","Login Error",JOptionPane.WARNING_MESSAGE);
							}
					}
			});
		
		BTN_search1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
					{
						int pid=Integer.parseInt(TF_pid1.getText());
						Product product = new Product();
						retf=product.ProductSearch(pid);
						if(retf==1)
							{
								Manager_GUI.setVisible(false);
								Search_GUI.setVisible(true);
								LBL_pidval1.setText(String.valueOf(product.ProductRetpid()));
								LBL_pinfval1.setText(product.ProductRetpinf());
								LBL_stockval1.setText(String.valueOf(product.ProductRetstck()));	
							}
						else 
							{
								JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
							}
					}
			});
		BTN_search2.addActionListener(new ActionListener() 			
			{
				public void actionPerformed(ActionEvent e)
					{
						int pid=Integer.parseInt(TF_pid2.getText());
						Product product = new Product();
						retf=product.ProductSearch(pid);
						if(retf==1)
							{
								Salesman_GUI.setVisible(false);
								Search_GUI.setVisible(true);
								LBL_pidval1.setText(String.valueOf(product.ProductRetpid()));
								LBL_pinfval1.setText(product.ProductRetpinf());
								LBL_stockval1.setText(String.valueOf(product.ProductRetstck()));	
							}
						else 
							{
								JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
							}
					}
			});
		
		BTN_update1.addActionListener(new ActionListener() 			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(TF_pid1.getText());
					Product product = new Product();
					retf=product.ProductSearch(pid);
					if(retf==1)
						{
							Manager_GUI.setVisible(false);
							EditStock_GUI.setVisible(true);
							LBL_pidval2.setText(String.valueOf(product.ProductRetpid()));
							LBL_pinfval2.setText(String.valueOf(product.ProductRetpinf()));
							TF_stockUpd.setText(String.valueOf(product.ProductRetstck()));	
						}
					else 
						{
							JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
						}
				}
		});
	
		BTN_update2.addActionListener(new ActionListener() 			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(TF_pid2.getText());
					Product product = new Product();
					retf=product.ProductSearch(pid);
					if(retf==1)
						{
							Salesman_GUI.setVisible(false);
							EditStock_GUI.setVisible(true);
							LBL_pidval2.setText(String.valueOf(product.ProductRetpid()));
							LBL_pinfval2.setText(String.valueOf(product.ProductRetpinf()));
							TF_stockUpd.setText(String.valueOf(product.ProductRetstck()));	
						}
					else 
						{
							JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
						}
				}
		});
	
		BTN_update3.addActionListener(new ActionListener()  			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(LBL_pidval1.getText());
					Product product = new Product();
					retf=product.ProductSearch(pid);
					if(retf==1)
						{
							Search_GUI.setVisible(false);
							EditStock_GUI.setVisible(true);
							LBL_pidval2.setText(String.valueOf(product.ProductRetpid()));
							LBL_pinfval2.setText(String.valueOf(product.ProductRetpinf()));
							TF_stockUpd.setText(String.valueOf(product.ProductRetstck()));	
						}
					else 
						{
							JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
						}
				}
		});
	
		
		
		BTN_home1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (role.equals("admin")) {Search_GUI.setVisible(false);Manager_GUI.setVisible(true);TF_pid1.setText("");}
				else if (role.equals("sales")) {Search_GUI.setVisible(false);Salesman_GUI.setVisible(true);TF_pid2.setText("");}
			}
		});
		BTN_home2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (role.equals("admin")) {EditStock_GUI.setVisible(false);Manager_GUI.setVisible(true);TF_pid1.setText("");}
				else if (role.equals("sales")) {EditStock_GUI.setVisible(false);Salesman_GUI.setVisible(true);TF_pid2.setText("");}
			}
		});
		BTN_home3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (role.equals("admin")) {AddNew_GUI.setVisible(false);Manager_GUI.setVisible(true);TF_pid1.setText("");}
				else if (role.equals("sales")) {AddNew_GUI.setVisible(false);Salesman_GUI.setVisible(true);TF_pid2.setText("");}
			}
		});
		
		BTN_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Manager_GUI.setVisible(false);
				AddNew_GUI.setVisible(true);
			}
		});
		
		BTN_updatefinal.addActionListener(new ActionListener()  			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(LBL_pidval2.getText());
					int stock=Integer.parseInt(TF_stockUpd.getText());
					Product product = new Product();
					retf=product.ProductUpd(pid,stock);
					if(retf==1)
						{	
							JOptionPane.showMessageDialog(frame,"Product updated");
							retf1=product.ProductSearch(pid);
							if(retf==1) 
								{
									EditStock_GUI.setVisible(false);
									Search_GUI.setVisible(true);
									LBL_pidval1.setText(String.valueOf(product.ProductRetpid()));
									LBL_pinfval1.setText(product.ProductRetpinf());
									LBL_stockval1.setText(String.valueOf(product.ProductRetstck()));	
								}
							else 
								{
									JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
								}
						}
					else
						{
						JOptionPane.showMessageDialog(frame,"Product could not update","Search Error",JOptionPane.WARNING_MESSAGE);
						}
						
					
				}
		});
		
		BTN_AddNew.addActionListener(new ActionListener()			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(TF_pidn.getText());
					String pinf=TF_pinfn.getText();
					int stock=Integer.parseInt(TF_stockn.getText());
					Product product = new Product();
					retf=product.ProductNew(pid,pinf,stock);
					if(retf==1)
						{	
							JOptionPane.showMessageDialog(frame,"New product added");
							retf1=product.ProductSearch(pid);
							if(retf==1) 
								{
								AddNew_GUI.setVisible(false);
								Search_GUI.setVisible(true);
								LBL_pidval1.setText(String.valueOf(product.ProductRetpid()));
								LBL_pinfval1.setText(product.ProductRetpinf());
								LBL_stockval1.setText(String.valueOf(product.ProductRetstck()));	
							}else {JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);}
						}
					else
						{
						JOptionPane.showMessageDialog(frame,"Database could not update check product id may already exist","Error",JOptionPane.WARNING_MESSAGE);
						}
						
					
				}
		});
		
	}
}
