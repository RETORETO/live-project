package ui;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		JPanel myPanel;
		JLabel label;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1440, 732);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		String path = "src/images/background.jpg";  
		ImageIcon background = new ImageIcon(path);
		label = new JLabel(background);	
		label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());
		myPanel = (JPanel)this.getContentPane();
		myPanel.setOpaque(false);
		myPanel.setLayout(new FlowLayout());
		this.getLayeredPane().setLayout(null);
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("src/images/appointment.png"));
		btnNewButton.setBounds(712, 76, 329, 115);
		
		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				BookMask book = new BookMask();
				book.setVisible(true);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InquireMask inquire = new InquireMask();
				inquire.setVisible(true);
			}
		});

		
		btnNewButton_1.setIcon(new ImageIcon("src/images/lottery.png"));
		btnNewButton_1.setBounds(1074, 76, 329, 115);
		contentPane.add(btnNewButton_1);
	}
}
