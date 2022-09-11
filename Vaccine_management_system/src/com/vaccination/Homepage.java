package com.vaccination;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class Homepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Homepage frame = new Homepage();
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
	public Homepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 790, 530);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(230, 230, 250));
		contentPane.setBorder(new LineBorder(Color.BLACK, 2));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/covid.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(308, 57, 482, 473);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBorder(new LineBorder(Color.BLACK, 2));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login l = new Login();
				l.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(78, 396, 154, 33);
		contentPane.add(btnNewButton);
		
		JButton btnSingup = new JButton("SignUp");
		btnSingup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Register r = new Register();
				r.setVisible(true);
				setVisible(false);
			}
		});
		btnSingup.setBorderPainted(false);
		btnSingup.setBackground(Color.RED);
		btnSingup.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnSingup.setBounds(78, 450, 154, 33);
		contentPane.add(btnSingup);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		Image img1 = new ImageIcon(this.getClass().getResource("/vac.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img1));
		lblNewLabel_1.setBounds(10, 57, 318, 322);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Covid-19 vaccine is here...");
		lblNewLabel_2.setForeground(new Color(30, 144, 255));
		lblNewLabel_2.setFont(new Font("Malgun Gothic", Font.BOLD, 23));
		lblNewLabel_2.setBounds(10, 10, 428, 39);
		contentPane.add(lblNewLabel_2);
		
		JButton btnX = new JButton("X");
		btnX.setBorder(new LineBorder(Color.BLACK, 2));
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnX.setBorderPainted(false);
		btnX.setBackground(new Color(255, 0, 0));
		btnX.setBounds(743, 0, 47, 49);
		contentPane.add(btnX);
		setUndecorated(true);

	}
}
