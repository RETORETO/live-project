package GUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InquireMask extends JFrame {

	private JPanel contentPane;
	private JTextField Jresevation_number;
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

	//限制JTextField的输入类型为数字
    public static void addNumLimit(JTextComponent component) {
     component.addKeyListener(new KeyListener() {
         @Override
         public void keyTyped(KeyEvent e) {
             String s = component.getText();
             String key="0123456789"+(char)8;
             if(s.length() > 32||key.indexOf(e.getKeyChar())<0) {
                 e.consume();
             }         
         }

         @Override
         public void keyPressed(KeyEvent e) {
             //do nothing
         }

         @Override
         public void keyReleased(KeyEvent e) {
             //do nothing
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
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setForeground(new Color(0, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Jresevation_number = new JTextField();
		Jresevation_number.setBackground(new Color(204, 255, 255));
		Jresevation_number.setToolTipText("请输入预约号进行查询");
		Jresevation_number.setHorizontalAlignment(SwingConstants.CENTER);
		Jresevation_number.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		Jresevation_number.setBounds(14, 71, 606, 106);
		contentPane.add(Jresevation_number);
		addNumLimit(Jresevation_number);
		Jresevation_number.setColumns(10);
		
		JButton btnNewButton = new JButton("查询");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String resevation_number=Jresevation_number.getText();
				System.out.println(resevation_number);
			}
		});
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
