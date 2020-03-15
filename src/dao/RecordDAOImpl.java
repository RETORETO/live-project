package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import pojo.Record;
import util.DbUtil;

public class RecordDAOImpl implements RecordDAO {
	public void add(Record bean) {
		
        String sql = "insert into record values(?,?,?,?,?,?,?)";
        
        try (Connection c = DbUtil.getConnection();PreparedStatement ps = c.prepareStatement(sql)) {
        	ps.setString(1, bean.getName());
        	ps.setString(2, bean.getId());
        	ps.setString(3, bean.getTel());
        	ps.setInt(4, bean.getMask_number());
        	ps.setInt(5, bean.getReservation_number());
        	ps.setInt(6, bean.getTurn());
        	ps.setInt(7, bean.getStatus());
        	ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
