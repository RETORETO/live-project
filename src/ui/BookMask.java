package GUI;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;

import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;

public class BookMask extends JFrame {

	private JPanel contentPane;
	private JTextField Jname;
	private JTextField Jid;
	private JTextArea textArea_1;
	private JTextArea textArea_2;
	private JTextField Jphone;
	private JTextArea textArea_3;
	private JTextField Jall;

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
	
	//限制JTextField的输入类型为身份证号
    public static void addIdLimit(JTextComponent component) {
     component.addKeyListener(new KeyListener() {
         @Override
         public void keyTyped(KeyEvent e) {
             String s = component.getText();
             String key="xX0123456789"+(char)8;
             if(s.length() >= 18||key.indexOf(e.getKeyChar())<0) {
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
	
	
			//限制JTextField的输入类型为手机号
       public static void addPhoneLimit(JTextComponent component) {
        component.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                String s = component.getText();
                String key="0123456789"+(char)8;
                if(s.length() >= 11||key.indexOf(e.getKeyChar())<0) {
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

		//限制JTextField的输入类型为数字
		public class ControlTheInputFornum extends KeyAdapter {

			public void keyTyped(KeyEvent e) {
				String key="0123456789"+(char)8;
				if(key.indexOf(e.getKeyChar())<0){
					e.consume();//如果不是数字则取消
				}
			}
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
	public BookMask() {
		setTitle("预约口罩");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(600, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(100, 149, 237));
		contentPane.setToolTipText("test");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(100, 149, 237));
		textArea.setEditable(false);
		textArea.setBounds(68, 18, 244, 68);
		textArea.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		textArea.setText("真实姓名：");
		contentPane.add(textArea);
		
		
		Jname = new JTextField();
		Jname.setBackground(new Color(204, 255, 204));
		Jname.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		Jname.setBounds(326, 18, 249, 68);
		Jname.setColumns(10);
		contentPane.add(Jname);
		
		textArea_1 = new JTextArea();
		textArea_1.setBackground(new Color(100, 149, 237));
		textArea_1.setEditable(false);
		textArea_1.setBounds(68, 97, 244, 68);
		textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		textArea_1.setText("身份证号：");
		contentPane.add(textArea_1);
		
		Jid = new JTextField();
		Jid.setBackground(new Color(204, 255, 204));
		Jid.setBounds(326, 99, 297, 60);
		Jid.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		Jid.setColumns(10);
		//限制Jid只能输入数字和X
		//Jid.addKeyListener(new ControlTheInputForid());
		addIdLimit(Jid);
		contentPane.add(Jid);
		
		textArea_2 = new JTextArea();
		textArea_2.setBackground(new Color(100, 149, 237));
		textArea_2.setEditable(false);
		textArea_2.setBounds(68, 171, 196, 68);
		textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		textArea_2.setText("手机号：");
		contentPane.add(textArea_2);
		
		Jphone = new JTextField();
		Jphone.setBackground(new Color(204, 255, 204));
		Jphone.setBounds(306, 178, 269, 61);
		Jphone.setFont(new Font("微软雅黑", Font.PLAIN, 28));
		Jphone.setColumns(10);
		//限制Jphone只能输入数字
		//Jphone.addKeyListener(new ControlTheInputForphone());
		addPhoneLimit(Jphone);
		contentPane.add(Jphone);
		
		textArea_3 = new JTextArea();
		textArea_3.setBackground(new Color(100, 149, 237));
		textArea_3.setEditable(false);
		textArea_3.setBounds(68, 252, 249, 51);
		textArea_3.setFont(new Font("微软雅黑", Font.PLAIN, 35));
		textArea_3.setText("预约口罩数量：");
		contentPane.add(textArea_3);
		
		JTextArea Respond = new JTextArea();
		Respond.setFont(new Font("微软雅黑", Font.PLAIN, 27));
		Respond.setEditable(false);
		Respond.setBackground(new Color(100, 149, 237));
		Respond.setBounds(16, 331, 196, 68);
		contentPane.add(Respond);
		
		JSpinner Jmask_nums = new JSpinner();
		Jmask_nums.setBackground(new Color(204, 255, 204));
		Jmask_nums.setBounds(359, 243, 64, 62);
		Jmask_nums.setFont(new Font("微软雅黑", Font.PLAIN, 48));
		Jmask_nums.setModel(new SpinnerNumberModel(1, 1, 3, 1));
		contentPane.add(Jmask_nums);
		
		JButton button = new JButton("预约口罩");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String name=Jname.getText();
				String id=Jid.getText();
				String phone=Jphone.getText();
				int mask_nums=(int)Jmask_nums.getValue();
				System.out.println(name+'\n'+id+'\n'+phone);
				System.out.println(mask_nums);
				
				
				
				Respond.setText("提示信息");
			}
		});
		button.setBounds(226, 339, 183, 60);
		button.setFont(new Font("微软雅黑", Font.PLAIN, 32));
		button.setBackground(new Color(102, 204, 51));
		button.setForeground(Color.BLACK);
		contentPane.add(button);
		
		JButton button_1 = new JButton("开始预约");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("开始预约");
			}
		});
		button_1.setForeground(Color.BLACK);
		button_1.setFont(new Font("微软雅黑", Font.PLAIN, 32));
		button_1.setBackground(new Color(0, 204, 255));
		button_1.setBounds(440, 339, 183, 60);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("结束预约");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("结束预约");
			}
		});
		button_2.setForeground(Color.BLACK);
		button_2.setFont(new Font("微软雅黑", Font.PLAIN, 32));
		button_2.setBackground(new Color(204, 0, 51));
		button_2.setBounds(440, 411, 183, 60);
		contentPane.add(button_2);
		
		Jall = new JTextField();
		Jall.setBackground(new Color(204, 255, 204));
		Jall.setFont(new Font("微软雅黑", Font.PLAIN, 30));
		Jall.setBounds(14, 411, 195, 60);
		contentPane.add(Jall);
		//限制Jall只能输入数字
		Jall.addKeyListener(new ControlTheInputFornum());
		Jall.setColumns(10);
		
		JButton button_3 = new JButton("设置口罩总量");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String all=Jall.getText();
				System.out.println("设置口罩总量为"+all);
				
				
				
			   
			}
		});
		button_3.setForeground(Color.BLACK);
		button_3.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		button_3.setBackground(new Color(255, 204, 51));
		button_3.setBounds(226, 414, 183, 60);
		contentPane.add(button_3);
		
		
	}
}
