package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import pojo.Record;
import util.DbUtil;

public class RecordDAOImpl implements RecordDAO {
	public void add(Record bean) {
		
        String sql = "insert into record values(?,?,?,?,?,?,?)";
        
        try (Connection c = DbUtil.getConnection();PreparedStatement ps = c.prepareStatement(sql)) {
        	ps.setString(1, bean.getName());
        	ps.setString(2, bean.getId());
        	ps.setString(3, bean.getTel());
        	ps.setInt(4, bean.getMaskNumber());
        	ps.setInt(5, bean.getReservationNumber());
        	ps.setInt(6, bean.getTurn());
        	ps.setInt(7, bean.getStatus());
        	ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
	
	public void findInfo(JPanel panel,JTextField text){
		//输入要查询的预约号
		String findId = text.getText();
		String sql = "select * from record where reservation_number="+findId;
		try (Connection c = DbUtil.getConnection();PreparedStatement ps = c.prepareStatement(sql)) {           			
			ResultSet result = ps.executeQuery(); 				
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
                 case "0" :
                 show += "未中签/n";
                  break; 
                 case "1" :
                 show += "已中签/n";
                 break; 
                }
				
				result.close();
				ps.close();
					
				JOptionPane.showMessageDialog(null, show,"预约号查询",JOptionPane.PLAIN_MESSAGE);
			}
			else JOptionPane.showMessageDialog(null, "您输入的预约码有误","系统信息",JOptionPane.PLAIN_MESSAGE);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	

}
