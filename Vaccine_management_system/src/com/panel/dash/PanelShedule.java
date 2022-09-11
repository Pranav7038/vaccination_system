package com.panel.dash;

import com.vaccination.dao.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import com.utility.dao.EmailNotification;

import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class PanelShedule extends JPanel {
	private JTextField adharNo;
	String vaccionchose;
	private JTextField email;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Create the panel.
	 */
	public PanelShedule(String to) {
		setBorder(new LineBorder(new Color(0, 0, 0), 2));
		setBackground(new Color(224, 255, 255));
		setBounds(0, 0, 826, 733);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(238, 232, 170));
		panel.setBounds(0, 0, 826, 101);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TAKE A VACCINE, TO SAVE YOUR LIFE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(160, 21, 427, 56);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel_1.setBackground(new Color(173, 216, 230));
		panel_1.setBounds(34, 132, 768, 573);
		add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Adharr No :");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1.setBounds(48, 140, 132, 46);
		panel_1.add(lblNewLabel_1);
		
		adharNo = new JTextField();
		adharNo.setBounds(200, 154, 213, 27);
		panel_1.add(adharNo);
		adharNo.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Date :");
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(48, 198, 132, 46);
		panel_1.add(lblNewLabel_1_1);
		
		JDateChooser date = new JDateChooser();
		date.setBounds(200, 210, 186, 27);
		panel_1.add(date);
		
		JLabel lblNewLabel_1_2 = new JLabel("Vaccination Choose :");
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(44, 254, 223, 46);
		panel_1.add(lblNewLabel_1_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("COVAXIN");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vaccionchose = "COVAXIN";
				
			}
		});
		rdbtnNewRadioButton.setBackground(new Color(173, 216, 230));
		rdbtnNewRadioButton.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(49, 306, 103, 21);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnCovidsheild = new JRadioButton("COVIDSHIELD");
		buttonGroup.add(rdbtnCovidsheild);
		rdbtnNewRadioButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vaccionchose = "COVIDSHIELD";
				
			}
		});
		rdbtnCovidsheild.setBackground(new Color(173, 216, 230));
		rdbtnCovidsheild.setFont(new Font("Segoe UI Variable", Font.BOLD, 15));
		rdbtnCovidsheild.setBounds(48, 341, 132, 21);
		panel_1.add(rdbtnCovidsheild);
		
		JLabel lblNewLabel_1_3 = new JLabel("Center :");
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(48, 381, 132, 46);
		panel_1.add(lblNewLabel_1_3);
		
		JComboBox center = new JComboBox();
		center.addItem("");
		center.addItem("City hospital, solapur");
		center.addItem("Ashwini hospital, solapur");
		center.addItem("Railway hospital, solapur");
		center.addItem("Yashodhara hospital, solapur");
		center.addItem("Ambika hospital, solapur");
		center.setBounds(190, 394, 196, 29);
		panel_1.add(center);
		
		JButton btnNewButton = new JButton("Book your slot");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"Registered Successfully!");
				String AdhaarNo=adharNo.getText();
				String Date = date.getDate().toString();
				//String VaccineChoose=(buttonGroup.getSelection().getActionCommand());
				String VaccineChoose = vaccionchose;
				String Center=(String) center.getSelectedItem();
				DatabaseOperations db = new DatabaseOperations();
				db.appointment(AdhaarNo,Date,VaccineChoose,Center) ;
				EmailNotification en = new EmailNotification();
				en.sendAppointmentBookedMail(email.getText());
				JOptionPane.showMessageDialog(null, "Slot Booked Successfully\nCheck your mail for confirmation", "Success",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(175, 238, 238));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(100, 460, 167, 35);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/schedule.jpg")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(446, 142, 312, 217);
		panel_1.add(lblNewLabel_2);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(200, 98, 213, 27);
		panel_1.add(email);
		
		JLabel lblNewLabel_1_4 = new JLabel("Email Id :");
		lblNewLabel_1_4.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(48, 84, 132, 46);
		panel_1.add(lblNewLabel_1_4);
		setVisible(true);
	}
}
