package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.SpringLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

public class BookMask extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextField textField_2;
	private JTextArea textArea_3;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookMask frame = new BookMask();
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
	public BookMask() {
		setTitle("预约口罩");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(600, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setToolTipText("test");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(26, 44, 0, 0);
		contentPane.add(label);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(68, 18, 244, 68);
		textArea.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		textArea.setText("真实姓名：");
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		textField.setBounds(326, 18, 249, 68);
		textField.setColumns(10);
		contentPane.add(textField);
		
		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setBounds(68, 97, 244, 68);
		textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		textArea_1.setText("身份证号：");
		contentPane.add(textArea_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(326, 99, 297, 60);
		textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		textArea_2 = new JTextArea();
		textArea_2.setEditable(false);
		textArea_2.setBounds(68, 171, 196, 68);
		textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		textArea_2.setText("手机号：");
		contentPane.add(textArea_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(306, 178, 269, 61);
		textField_2.setFont(new Font("宋体", Font.PLAIN, 28));
		textField_2.setColumns(10);
		contentPane.add(textField_2);
		
		textArea_3 = new JTextArea();
		textArea_3.setEditable(false);
		textArea_3.setBounds(68, 252, 249, 51);
		textArea_3.setFont(new Font("微软雅黑", Font.PLAIN, 35));
		textArea_3.setText("预约口罩数量：");
		contentPane.add(textArea_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(359, 243, 47, 62);
		spinner.setFont(new Font("宋体", Font.PLAIN, 48));
		spinner.setModel(new SpinnerNumberModel(1, 1, 3, 1));
		contentPane.add(spinner);
		
		JButton button = new JButton("预约口罩");
		button.setBounds(226, 339, 183, 60);
		button.setFont(new Font("微软雅黑", Font.PLAIN, 32));
		button.setBackground(new Color(102, 204, 51));
		button.setForeground(Color.BLACK);
		contentPane.add(button);
		
		JButton button_1 = new JButton("开始预约");
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 32));
		button_1.setBackground(new Color(0, 204, 255));
		button_1.setBounds(440, 339, 183, 60);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("结束预约");
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 32));
		button_2.setBackground(new Color(204, 0, 51));
		button_2.setBounds(440, 411, 183, 60);
		contentPane.add(button_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		textField_3.setBounds(14, 411, 195, 60);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button_3 = new JButton("设置口罩总量");
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		button_3.setBackground(new Color(255, 204, 51));
		button_3.setBounds(226, 414, 183, 60);
		contentPane.add(button_3);
	}
}
