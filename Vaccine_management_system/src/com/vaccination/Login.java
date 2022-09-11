package com.vaccination;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.vaccination.dao.LoginDB;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;
	private JPasswordField pwField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		contentPane.setBackground(new Color(173, 216, 230));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img1 = new ImageIcon(this.getClass().getResource("/lo.jpg")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(315, 114, 467, 359);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Username :");
		lblNewLabel_2.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2.setBounds(43, 174, 187, 31);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password :");
		lblNewLabel_2_1.setFont(new Font("Calibri", Font.BOLD, 20));
		lblNewLabel_2_1.setBounds(43, 257, 187, 31);
		contentPane.add(lblNewLabel_2_1);
		
		username = new JTextField();
		username.setFont(new Font("Shruti", Font.BOLD, 15));
		username.setHorizontalAlignment(SwingConstants.CENTER);
		username.setBounds(31, 215, 199, 25);
		contentPane.add(username);
		username.setColumns(10);
		
		JLabel req1 = new JLabel("");
		req1.setForeground(Color.RED);
		req1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req1.setBounds(113, 250, 175, 13);
		contentPane.add(req1);
		
		JLabel req = new JLabel("");
		req.setForeground(Color.RED);
		req.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req.setBounds(127, 340, 161, 13);
		contentPane.add(req);
		
		JLabel req3 = new JLabel("");
		req3.setForeground(Color.RED);
		req3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		req3.setBounds(642, 488, 161, 19);
		contentPane.add(req3);
		
		
		JLabel req2 = new JLabel("");
		req2.setForeground(new Color(135, 206, 250));
		req2.setFont(new Font("Tahoma", Font.BOLD, 13));
		req2.setBounds(315, 488, 161, 19);
		contentPane.add(req2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean valusern,valusern2,valpass,valpass2,boolean1;
				String uname = username.getText();
				String pass = new String( pwField.getPassword());
				LoginDB lb1=new LoginDB();
				boolean1=lb1.SelectStatement(uname, pass);
				valpass = pwField.getPassword().equals("");
				valusern = username.getText().equals("");
				if(boolean1==true)
				{
					Dashboard db = new Dashboard(username.getText());
					System.out.println(username.getText());
					db.main(username.getText());
					db.setVisible(true);
					setVisible(false);
					//JOptionPane.showMessageDialog(null, "Log In Succesfull");
				}
				else 
				{
					JOptionPane.showMessageDialog(null,"Invalid email or password!");
				}
				
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(66, 358, 153, 31);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/US.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img));
		lblNewLabel_3.setBounds(240, 204, 59, 43);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		Image img2 = new ImageIcon(this.getClass().getResource("/pws.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img2));
		lblNewLabel_4.setBounds(240, 273, 59, 41);
		contentPane.add(lblNewLabel_4);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Homepage hp = new Homepage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnBack.setBorderPainted(false);
		btnBack.setBackground(Color.RED);
		btnBack.setBounds(66, 417, 153, 31);
		contentPane.add(btnBack);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(265, 352, -131, 19);
		contentPane.add(passwordField);
		
		pwField = new JPasswordField();
		pwField.setFont(new Font("Shruti", Font.BOLD, 15));
		pwField.setBounds(31, 287, 199, 25);
		contentPane.add(pwField);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(0, 0, 790, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome Please LogIn");
		lblNewLabel.setBounds(244, 10, 290, 49);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 27));
		
		JButton btnX = new JButton("X");
		btnX.setBounds(749, 0, 41, 49);
		panel.add(btnX);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnX.setBorderPainted(false);
		btnX.setBackground(new Color(255, 0, 0));
		setUndecorated(true);


	}
}
