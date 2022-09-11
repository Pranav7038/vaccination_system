package com.vaccination;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.panel.dash.PanelHome;
import com.panel.dash.PanelShedule;
import com.panel.dash.PanelView;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class Dashboard extends JFrame {

	private JPanel contentPane;
	
	private PanelHome panelhome;
	private PanelShedule panelshedule;
	private PanelView panelview;
	private static String email;
	/**
	 * Launch the application.
	 */
	public static void main(String emailId) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard frame = new Dashboard(emailId);
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
	public Dashboard(String email) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1081, 733);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//System.out.println(email);
		panelhome = new PanelHome(email);
		panelshedule = new PanelShedule(null);
		panelview = new PanelView(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(0, 0, 256, 733);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel paneHome = new JPanel();
		paneHome.setBorder(new LineBorder(new Color(0, 0, 0)));
		paneHome.addMouseListener(new PanelButtonMouseAdapter(paneHome) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelhome);
			}
		});
		paneHome.setBackground(new Color(0, 128, 128));
		paneHome.setBounds(0, 310, 256, 56);
		panel.add(paneHome);
		paneHome.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("My Profile");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(74, 10, 132, 23);
		paneHome.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		Image img = new ImageIcon(this.getClass().getResource("/logo1.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img));
		lblNewLabel_2.setBounds(0, 0, 76, 56);
		paneHome.add(lblNewLabel_2);

		
		JPanel panevaccine = new JPanel();
		panevaccine.setBorder(new LineBorder(new Color(0, 0, 0)));
		panevaccine.addMouseListener(new PanelButtonMouseAdapter(panevaccine) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelshedule);
			}
		});
		panevaccine.setBackground(new Color(0, 128, 128));
		panevaccine.setBounds(0, 365, 256, 56);
		panel.add(panevaccine);
		panevaccine.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Vaccine Schedule");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(79, 10, 167, 23);
		panevaccine.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		Image img1 = new ImageIcon(this.getClass().getResource("/logo4.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img1));
		lblNewLabel_3.setBounds(0, 0, 76, 56);
		panevaccine.add(lblNewLabel_3);


		
		JPanel paneview = new JPanel();
		paneview.setBorder(new LineBorder(new Color(0, 0, 0)));
		paneview.addMouseListener(new PanelButtonMouseAdapter(paneview) {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelview);
			}
		});
		paneview.setBackground(new Color(0, 128, 128));
		paneview.setBounds(0, 420, 256, 56);
		panel.add(paneview);
		paneview.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("View Appointment");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNewLabel_1_2.setBounds(71, 10, 175, 23);
		paneview.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		Image img4 = new ImageIcon(this.getClass().getResource("/logo6.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img4));
		lblNewLabel_4.setBounds(0, 0, 75, 56);
		paneview.add(lblNewLabel_4);
		
		JPanel panesign = new JPanel();
		paneview.addMouseListener(new PanelButtonMouseAdapter(panesign) {
		});
		panesign.setBorder(new LineBorder(new Color(0, 0, 0)));
		panesign.addMouseListener(new PanelButtonMouseAdapter(panesign));
		panesign.setBackground(new Color(0, 128, 128));
		panesign.setBounds(0, 624, 256, 56);
		panel.add(panesign);
		panesign.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("SignOut");
		lblNewLabel_1_3.setBounds(61, 10, 132, 23);
		panesign.add(lblNewLabel_1_3);
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Dialog", Font.BOLD, 18));
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Image img2 = new ImageIcon(this.getClass().getResource("/corona.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img2));
		lblNewLabel.setBounds(10, 26, 236, 256);
		panel.add(lblNewLabel);
		
		JPanel panelmain = new JPanel();
		panelmain.setBounds(255, 0, 826, 733);
		contentPane.add(panelmain);
		panelmain.setLayout(null);
		
		panelmain.add(panelhome);
		panelmain.add(panelshedule);
		panelmain.add(panelview);
		
		menuClicked(panelhome);
		setUndecorated(true);
	}
	public void menuClicked(JPanel panel) {
		panelhome.setVisible(false);
		panelshedule.setVisible(false);
		panelview.setVisible(false);
		
		panel.setVisible(true);
	}
	public class PanelButtonMouseAdapter extends MouseAdapter{
		JPanel panel;
		public PanelButtonMouseAdapter(JPanel panel) {
			this.panel = panel;
		}
		public void mouseEntered(MouseEvent e) {
			panel.setBackground(new Color(0, 128, 128));
		}
		@Override
		public void mouseExited(MouseEvent e) {
			panel.setBackground(new Color(0, 128, 128));
		}
		@Override
		public void mousePressed(MouseEvent e) {
			panel.setBackground(new Color(95, 158, 160));
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			panel.setBackground(new Color(112, 128, 144));
		}
	}
}
