package ui;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionListener;
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
		// 把背景图片显示在一个标签里面
		label = new JLabel(background);		//把背景图片添加到标签里
		label.setBounds(0, 0, background.getIconWidth(), background.getIconHeight());	//把标签设置为和图片等高等宽
		myPanel = (JPanel)this.getContentPane();		//把我的面板设置为内容面板
		myPanel.setOpaque(false);					//把我的面板设置为不可视
		myPanel.setLayout(new FlowLayout());		//把我的面板设置为流动布局
		this.getLayeredPane().setLayout(null);		//把分层面板的布局置空
		this.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("src/images/appointment.png"));
		btnNewButton.setBounds(712, 76, 329, 115);
		//btnNewButton.setIcon(new ImageIcon(getClass().getResource("src/images/appointment.png"))); 
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("src/images/lottery.png"));
		btnNewButton_1.setBounds(1074, 76, 329, 115);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("src/images/admin_mode.png"));
		btnNewButton_2.setBounds(1074, 535, 329, 115);
		contentPane.add(btnNewButton_2);
	}
}
