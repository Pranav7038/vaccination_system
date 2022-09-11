package com.panel.dash;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.util.ArrayList;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

import com.vaccination.dao.*;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelHome extends JPanel {
	/**
	 * Create the panel.
	 */
	private static ArrayList<String> al;
	public PanelHome(String emailId) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		SelectOperation so = new SelectOperation();
		al = so.select_profiles_details(emailId);
		//System.out.println(al);
		//System.out.println(emailId);
		LoginDB lb1=new LoginDB();
		
		setBackground(new Color(224, 255, 255));
		setBounds(0, 0,  826, 733);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(0, 0, 826, 101);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME TO YOUR PROFILE");
		lblNewLabel_1.setForeground(new Color(128, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(258, 23, 304, 44);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("X");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(772, 0, 54, 50);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Covid 19");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(20, 23, 193, 35);
		panel.add(lblNewLabel_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBounds(34, 125, 758, 576);
		add(panel_1);
		panel_1.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setToolTipText("");
		separator_1.setBounds(369, 391, -31, -382);
		panel_1.add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(374, 7, 0, 2);
		panel_1.add(separator);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/pro.jpg")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(29, 43, 366, 410);
		panel_1.add(lblNewLabel);
		Image img1 = new ImageIcon(this.getClass().getResource("/gre.png")).getImage();
		Image img2 = new ImageIcon(this.getClass().getResource("/wrong.png")).getImage();
		
		JLabel Name = new JLabel();
		Name.setFont(new Font("Tahoma", Font.BOLD, 18));
		Name.setBounds(430, 66, 257, 33);
		panel_1.add(Name);
		
		JLabel dob = new JLabel();
		dob.setFont(new Font("Tahoma", Font.BOLD, 17));
		dob.setBounds(430, 143, 257, 33);
		panel_1.add(dob);
		
		JLabel mobileno = new JLabel();
		mobileno.setFont(new Font("Tahoma", Font.BOLD, 17));
		mobileno.setBounds(430, 213, 257, 33);
		panel_1.add(mobileno);
		
		JLabel emailid = new JLabel();
		emailid.setFont(new Font("Tahoma", Font.BOLD, 17));
		emailid.setBounds(430, 283, 257, 33);
		panel_1.add(emailid);
		
		JLabel gender = new JLabel();
		gender.setFont(new Font("Tahoma", Font.BOLD, 17));
		gender.setBounds(430, 357, 257, 33);
		panel_1.add(gender);
		
		try {
		Name.setVisible(true);
		//System.out.println(al.get(0));
		Name.setText(al.get(0));
		dob.setText(al.get(1));
		mobileno.setText(al.get(2));
		emailid.setText(al.get(3));
		gender.setText(al.get(4));
		}
		catch(Exception e) {
			e.printStackTrace();

		}
		setVisible(true);
	}
}
