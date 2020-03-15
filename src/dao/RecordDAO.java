package dao;

import javax.swing.JPanel;
import javax.swing.JTextField;

import pojo.Record;

public interface RecordDAO {
	
	void add(Record record);
	public void findInfo(JPanel panel,JTextField text);
}
