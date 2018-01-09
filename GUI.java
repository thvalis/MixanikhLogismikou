import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DropMode;

public class GUI {

	private JFrame frame;
	private JTextField TF_id;
	private JPasswordField PSWF;
	private JTextField TF_pid1;
	private JTextField TF_pid2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField TF_stockUpd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
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
	public GUI() {
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
		
		JLabel LBL_id =new JLabel("ID");
		LBL_id.setBounds(30, 20, 50, 20);
		Login_GUI.add(LBL_id);
		
		JLabel LBL_psw = new JLabel("Password");
		LBL_psw.setBounds(30, 60, 50, 20);
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
		
		JPanel Manager_GUI = new JPanel();
		frame.getContentPane().add(Manager_GUI, "name_5905394140268");
		Manager_GUI.setLayout(null);
		
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
		
		JButton BTN_add = new JButton("New Product");
		BTN_add.setBounds(50, 160, 90, 40);
		Manager_GUI.add(BTN_add);
		
		JButton BTN_statistics = new JButton("Statistics");
		BTN_statistics.setBounds(160, 160, 90, 40);
		Manager_GUI.add(BTN_statistics);
		
		JPanel Salesman_GUI = new JPanel();
		frame.getContentPane().add(Salesman_GUI, "name_5907912919917");
		Salesman_GUI.setLayout(null);
		
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
		
		JPanel Search_GUI = new JPanel();
		frame.getContentPane().add(Search_GUI, "name_5912612946993");
		Search_GUI.setLayout(null);
		
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
		
		JPanel EditStock_GUI = new JPanel();
		frame.getContentPane().add(EditStock_GUI, "name_5914930642289");
		EditStock_GUI.setLayout(null);
		
		JButton BTN_updatefinal = new JButton("Confirm");
		BTN_updatefinal.setBounds(100, 140, 100, 40);
		EditStock_GUI.add(BTN_updatefinal);
		
		JLabel LBL_pid4 = new JLabel("Product id:");
		LBL_pid4.setFont(new Font("Tahoma", Font.BOLD, 11));
		LBL_pid4.setBounds(50, 20, 90, 20);
		EditStock_GUI.add(LBL_pid4);
		
		JLabel LBL_pinfo2 = new JLabel("Product info");
		LBL_pinfo2.setFont(new Font("Tahoma", Font.BOLD, 11));
		LBL_pinfo2.setBounds(50, 60, 90, 20);
		EditStock_GUI.add(LBL_pinfo2);
		
		JLabel LBL_stock2 = new JLabel("Stock");
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
		TF_stockUpd.setDropMode(DropMode.ON_OR_INSERT_COLS);
		TF_stockUpd.setBounds(160, 100, 90, 20);
		EditStock_GUI.add(TF_stockUpd);
		TF_stockUpd.setColumns(10);
		
		JPanel AddNew_GUI = new JPanel();
		frame.getContentPane().add(AddNew_GUI, "name_5927512819686");
		AddNew_GUI.setLayout(null);
		
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
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 20, 90, 20);
		AddNew_GUI.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(160, 60, 90, 20);
		AddNew_GUI.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(160, 100, 90, 20);
		AddNew_GUI.add(textField_5);
		textField_5.setColumns(10);
	}
}
