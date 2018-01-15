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
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import model.Login;
import model.Product;

import java.awt.Font;

public class StoreGui extends JFrame {

	private JFrame frame;
	private JTextField tfid;
	private JPasswordField pswf;
	private JTextField tfpid1;
	private JTextField tfpid2;
	private JTextField tfpidn;
	private JTextField tfpinfn;
	private JTextField tfstockn;
	private JTextField tfstockUpd;
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
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel loginGUI = new JPanel();
		frame.getContentPane().add(loginGUI, "name_5923233092382");
		loginGUI.setLayout(null);
	
		JPanel managerGUI = new JPanel();
		frame.getContentPane().add(managerGUI, "name_5905394140268");
		managerGUI.setLayout(null);
		
		JPanel salesmanGUI = new JPanel();
		frame.getContentPane().add(salesmanGUI, "name_5907912919917");
		salesmanGUI.setLayout(null);
		
		JPanel searchGUI = new JPanel();
		frame.getContentPane().add(searchGUI, "name_5912612946993");
		searchGUI.setLayout(null);
		
		JPanel editStockGUI = new JPanel();
		frame.getContentPane().add(editStockGUI, "name_5914930642289");
		editStockGUI.setLayout(null);
		
		JPanel addNewGUI = new JPanel();
		frame.getContentPane().add(addNewGUI, "name_5927512819686");
		addNewGUI.setLayout(null);
		
		
		JLabel lblid =new JLabel("ID");
		lblid.setBounds(30, 20, 70, 20);
		loginGUI.add(lblid);
		
		JLabel lblpsw = new JLabel("Password");
		lblpsw.setBounds(30, 60, 70, 20);
		loginGUI.add(lblpsw);
		
		tfid = new JTextField();
		tfid.setBounds(110, 20, 150, 20);
		loginGUI.add(tfid);
		tfid.setColumns(10);
		
		pswf = new JPasswordField();
		pswf.setBounds(110, 60, 150, 20);
		loginGUI.add(pswf);
		
		JButton btnlogin = new JButton("Login");
		btnlogin.setBounds(100, 150, 100, 50);
		loginGUI.add(btnlogin);
		
		
		tfpid1 = new JTextField();
		tfpid1.setBounds(100, 60, 100, 20);
		managerGUI.add(tfpid1);
		tfpid1.setColumns(10);
		
		JLabel lblpid1 = new JLabel("Product ID");
		lblpid1.setHorizontalAlignment(SwingConstants.CENTER);
		lblpid1.setBounds(100, 20, 100, 20);
		managerGUI.add(lblpid1);
		
		JButton btnsearch1 = new JButton("Search");
		btnsearch1.setBounds(50, 100, 90, 40);
		managerGUI.add(btnsearch1);
		
		JButton btnupdate1 = new JButton("Update");
		btnupdate1.setBounds(160, 100, 90, 40);
		managerGUI.add(btnupdate1);
		
		JButton btnadd = new JButton("Add New");
		btnadd.setBounds(50, 160, 90, 40);
		managerGUI.add(btnadd);
		
		JButton btnstatistics = new JButton("Statistics");
		btnstatistics.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Feature Not Yet Implemented","Feature Missing",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnstatistics.setBounds(160, 160, 90, 40);
		managerGUI.add(btnstatistics);
		
		JButton btnbarcode1 = new JButton("Barcode");
		btnbarcode1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Feature Not Yet Implemented","Feature Missing",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnbarcode1.setBounds(100, 220, 100, 40);
		managerGUI.add(btnbarcode1);
		
		
		
		JLabel lblpid2 = new JLabel("Product ID");
		lblpid2.setHorizontalAlignment(SwingConstants.CENTER);
		lblpid2.setBounds(100, 20, 100, 20);
		salesmanGUI.add(lblpid2);
		
		tfpid2 = new JTextField();
		tfpid2.setBounds(100, 60, 100, 20);
		salesmanGUI.add(tfpid2);
		tfpid2.setColumns(10);
		
		JButton btnsearch2 = new JButton("Search");
		btnsearch2.setBounds(50, 100, 90, 40);
		salesmanGUI.add(btnsearch2);
		
		JButton btnupdate2 = new JButton("Update");
		btnupdate2.setBounds(160, 100, 90, 40);
		salesmanGUI.add(btnupdate2);
		
		JButton btnbarcode2 = new JButton("Barcode");
		btnbarcode2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame,"Feature Not Yet Implemented","Feature Missing",JOptionPane.ERROR_MESSAGE);
			}
		});
		btnbarcode2.setBounds(100, 160, 100, 40);
		salesmanGUI.add(btnbarcode2);
		

		
		JButton btnupdate3 = new JButton("Update");
		btnupdate3.setBounds(100, 140, 100, 40);
		searchGUI.add(btnupdate3);
		
		JLabel lblpid3 = new JLabel("Product id:");
		lblpid3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblpid3.setBounds(50, 20, 90, 20);
		searchGUI.add(lblpid3);
		
		JLabel lblpinfo1 = new JLabel("Product info:");
		lblpinfo1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblpinfo1.setBounds(50, 60, 90, 20);
		searchGUI.add(lblpinfo1);
		
		JLabel lblstock1 = new JLabel("Stock:");
		lblstock1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblstock1.setBounds(50, 100, 90, 20);
		searchGUI.add(lblstock1);
		
		JLabel lblpidval1 = new JLabel("");
		lblpidval1.setBounds(160, 20, 90, 20);
		searchGUI.add(lblpidval1);
		
		JLabel lblpinfval1 = new JLabel("");
		lblpinfval1.setBounds(160, 60, 90, 20);
		searchGUI.add(lblpinfval1);
		
		JLabel lblstockval1 = new JLabel("");
		lblstockval1.setBounds(160, 100, 90, 20);
		searchGUI.add(lblstockval1);
		
		JButton btnhome1 = new JButton("Home");
		btnhome1.setBounds(100, 191, 100, 40);
		searchGUI.add(btnhome1);
		
		
		JButton btnupdatefinal = new JButton("Confirm");
		btnupdatefinal.setBounds(100, 140, 100, 40);
		editStockGUI.add(btnupdatefinal);
		
		JLabel lblpid4 = new JLabel("Product id:");
		lblpid4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblpid4.setBounds(50, 20, 90, 20);
		editStockGUI.add(lblpid4);
		
		JLabel lblpinfo2 = new JLabel("Product info:");
		lblpinfo2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblpinfo2.setBounds(50, 60, 90, 20);
		editStockGUI.add(lblpinfo2);
		
		JLabel lblstock2 = new JLabel("Stock:");
		lblstock2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblstock2.setBounds(50, 100, 90, 20);
		editStockGUI.add(lblstock2);
		
		JLabel lblpidval2 = new JLabel("");
		lblpidval2.setBounds(160, 20, 90, 20);
		editStockGUI.add(lblpidval2);
		
		JLabel lblpinfval2 = new JLabel("");
		lblpinfval2.setBounds(160, 60, 90, 20);
		editStockGUI.add(lblpinfval2);
		
		tfstockUpd = new JTextField();
		tfstockUpd.setBounds(160, 100, 90, 20);
		editStockGUI.add(tfstockUpd);
		tfstockUpd.setColumns(10);
		
		JButton btnhome2 = new JButton("Home");
		btnhome2.setBounds(100, 191, 100, 40);
		editStockGUI.add(btnhome2);
		
		
		
		JButton btnAddNew = new JButton("Add Product");
		btnAddNew.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnAddNew.setBounds(100, 140, 100, 40);
		addNewGUI.add(btnAddNew);
		
		JLabel lblProductId = new JLabel("Product id:");
		lblProductId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProductId.setBounds(50, 20, 90, 20);
		addNewGUI.add(lblProductId);
		
		JLabel lblProductInfo = new JLabel("Product info:");
		lblProductInfo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblProductInfo.setBounds(50, 60, 90, 20);
		addNewGUI.add(lblProductInfo);
		
		JLabel lblStock = new JLabel("Stock");
		lblStock.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblStock.setBounds(50, 100, 90, 20);
		addNewGUI.add(lblStock);
		
		tfpidn = new JTextField();
		tfpidn.setBounds(160, 20, 90, 20);
		addNewGUI.add(tfpidn);
		tfpidn.setColumns(10);
		
		tfpinfn = new JTextField();
		tfpinfn.setBounds(160, 60, 90, 20);
		addNewGUI.add(tfpinfn);
		tfpinfn.setColumns(10);
		
		tfstockn = new JTextField();
		tfstockn.setBounds(160, 100, 90, 20);
		addNewGUI.add(tfstockn);
		tfstockn.setColumns(10);
		
		JButton btnhome3 = new JButton("Home");
		btnhome3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnhome3.setBounds(100, 191, 100, 40);
		addNewGUI.add(btnhome3);
		
		btnlogin.addActionListener(new ActionListener()
		{
				public void actionPerformed(ActionEvent e) 
					{
						int id = Integer.parseInt(tfid.getText());
						String pass = String.valueOf(pswf.getPassword());
						Login login = new Login();
						login.loging(id,pass);
						role=login.returnRole();
						if (role.equals("admin")) 
							{
								loginGUI.setVisible(false);
								managerGUI.setVisible(true);
							}
						else if (role.equals("sales")) 
							{
								loginGUI.setVisible(false);
								salesmanGUI.setVisible(true);
							}
						else if (role.equals("no")) 
							{
								JOptionPane.showMessageDialog(frame,"Wrong ID or Password please try again","Login Error",JOptionPane.WARNING_MESSAGE);
							}
					}
			});
		
		btnsearch1.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
					{
						int pid=Integer.parseInt(tfpid1.getText());
						Product product = new Product();
						retf=product.productSearch(pid);
						if(retf==1)
							{
								managerGUI.setVisible(false);
								searchGUI.setVisible(true);
								lblpidval1.setText(String.valueOf(product.productRetpid()));
								lblpinfval1.setText(product.productRetpinf());
								lblstockval1.setText(String.valueOf(product.productRetstck()));	
							}
						else 
							{
								JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
							}
					}
			});
		btnsearch2.addActionListener(new ActionListener() 			
			{
				public void actionPerformed(ActionEvent e)
					{
						int pid=Integer.parseInt(tfpid2.getText());
						Product product = new Product();
						retf=product.productSearch(pid);
						if(retf==1)
							{
								salesmanGUI.setVisible(false);
								searchGUI.setVisible(true);
								lblpidval1.setText(String.valueOf(product.productRetpid()));
								lblpinfval1.setText(product.productRetpinf());
								lblstockval1.setText(String.valueOf(product.productRetstck()));	
							}
						else 
							{
								JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
							}
					}
			});
		
		btnupdate1.addActionListener(new ActionListener() 			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(tfpid1.getText());
					Product product = new Product();
					retf=product.productSearch(pid);
					if(retf==1)
						{
							managerGUI.setVisible(false);
							editStockGUI.setVisible(true);
							lblpidval2.setText(String.valueOf(product.productRetpid()));
							lblpinfval2.setText(String.valueOf(product.productRetpinf()));
							tfstockUpd.setText(String.valueOf(product.productRetstck()));	
						}
					else 
						{
							JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
						}
				}
		});
	
		btnupdate2.addActionListener(new ActionListener() 			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(tfpid2.getText());
					Product product = new Product();
					retf=product.productSearch(pid);
					if(retf==1)
						{
							salesmanGUI.setVisible(false);
							editStockGUI.setVisible(true);
							lblpidval2.setText(String.valueOf(product.productRetpid()));
							lblpinfval2.setText(String.valueOf(product.productRetpinf()));
							tfstockUpd.setText(String.valueOf(product.productRetstck()));	
						}
					else 
						{
							JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
						}
				}
		});
	
		btnupdate3.addActionListener(new ActionListener()  			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(lblpidval1.getText());
					Product product = new Product();
					retf=product.productSearch(pid);
					if(retf==1)
						{
							searchGUI.setVisible(false);
							editStockGUI.setVisible(true);
							lblpidval2.setText(String.valueOf(product.productRetpid()));
							lblpinfval2.setText(String.valueOf(product.productRetpinf()));
							tfstockUpd.setText(String.valueOf(product.productRetstck()));	
						}
					else 
						{
							JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
						}
				}
		});
	
		
		
		btnhome1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (role.equals("admin")) {searchGUI.setVisible(false);managerGUI.setVisible(true);tfpid1.setText("");}
				else if (role.equals("sales")) {searchGUI.setVisible(false);salesmanGUI.setVisible(true);tfpid2.setText("");}
			}
		});
		btnhome2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (role.equals("admin")) {editStockGUI.setVisible(false);managerGUI.setVisible(true);tfpid1.setText("");}
				else if (role.equals("sales")) {editStockGUI.setVisible(false);salesmanGUI.setVisible(true);tfpid2.setText("");}
			}
		});
		btnhome3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (role.equals("admin")) {addNewGUI.setVisible(false);managerGUI.setVisible(true);tfpid1.setText("");}
				else if (role.equals("sales")) {addNewGUI.setVisible(false);salesmanGUI.setVisible(true);tfpid2.setText("");}
			}
		});
		
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				managerGUI.setVisible(false);
				addNewGUI.setVisible(true);
			}
		});
		
		btnupdatefinal.addActionListener(new ActionListener()  			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(lblpidval2.getText());
					int stock=Integer.parseInt(tfstockUpd.getText());
					Product product = new Product();
					retf=product.productUpd(pid,stock);
					if(retf==1)
						{	
							JOptionPane.showMessageDialog(frame,"Product updated");
							retf1=product.productSearch(pid);
							if(retf==1) 
								{
									editStockGUI.setVisible(false);
									searchGUI.setVisible(true);
									lblpidval1.setText(String.valueOf(product.productRetpid()));
									lblpinfval1.setText(product.productRetpinf());
									lblstockval1.setText(String.valueOf(product.productRetstck()));	
								}
							else 
								{
									JOptionPane.showMessageDialog(frame,"Product not found","Search Error",JOptionPane.WARNING_MESSAGE);
								}
						}
					else
						{
						JOptionPane.showMessageDialog(frame,"Product could not update","Error",JOptionPane.WARNING_MESSAGE);
						}
						
					
				}
		});
		
		btnAddNew.addActionListener(new ActionListener()			
		{
			public void actionPerformed(ActionEvent e)
				{
					int pid=Integer.parseInt(tfpidn.getText());
					String pinf=tfpinfn.getText();
					int stock=Integer.parseInt(tfstockn.getText());
					Product product = new Product();
					retf=product.productNew(pid,pinf,stock);
					if(retf==1)
						{	
							JOptionPane.showMessageDialog(frame,"New product added");
							retf1=product.productSearch(pid);
							if(retf==1) 
								{
								addNewGUI.setVisible(false);
								searchGUI.setVisible(true);
								lblpidval1.setText(String.valueOf(product.productRetpid()));
								lblpinfval1.setText(product.productRetpinf());
								lblstockval1.setText(String.valueOf(product.productRetstck()));	
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
