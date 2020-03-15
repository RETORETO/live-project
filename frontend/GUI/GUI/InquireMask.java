package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Window.Type;

public class InquireMask extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InquireMask frame = new InquireMask();
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
	public InquireMask() {
		setTitle("中签查询");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setToolTipText("请输入预约号进行查询");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		textField.setBounds(14, 71, 606, 106);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("查询");
		btnNewButton.setToolTipText("请输入预约号进行查询");
		btnNewButton.setBackground(new Color(175, 238, 238));
		btnNewButton.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		btnNewButton.setBounds(211, 210, 228, 93);
		contentPane.add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		textField_1.setText("结果");
		textField_1.setEditable(false);
		textField_1.setBounds(46, 334, 541, 111);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}

}
