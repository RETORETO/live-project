package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
 

public class isChoice {
   // 构造函数
	public isChoice(){}
	
	// 拿到要查询的信息并输出到主界面
	public void findInfo(JPanel panel,JTextField text){
		
		Connection conn;
		PreparedStatement preparedStatement = null;
		try {
            //输入要查询的预约号
			String findId = text.getText();

			//连接数据库
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/warehouse?useUnicode=true&characterEncoding=utf8","root","123456");

			String sql = "select * from record where reservation_number="+findId;
			preparedStatement = conn.prepareStatement(sql);
			
			ResultSet result = preparedStatement.executeQuery(); 
				
			if(result.next())
			{
                
				String test = result.getString("name");
				String show =  "预约人:"+test+"/n";
                test = result.getString("reservation_number");
				show += "预约号:"+test+"/n";
				test = result.getString("id");
				show += "身份证:"+test+"/n";
				test = result.getString("tel");
				show += "联系电话:"+test+"/n";
                test = result.getString("mask_number");
				show += "预约口罩数:"+test+"/n";
				test = result.getString("state");
                switch(test){
                 case '0' :
                 show += "未中签/n";
                  break; 
                 case '1' :
                 show += "已中签/n";
                 break; 
                }
				
				result.close();
				preparedStatement.close();
					
				JOptionPane.showMessageDialog(null, show,"预约号查询",JOptionPane.PLAIN_MESSAGE);
			}
			else JOptionPane.showMessageDialog(null, "您输入的预约码有误","系统信息",JOptionPane.PLAIN_MESSAGE);
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
}