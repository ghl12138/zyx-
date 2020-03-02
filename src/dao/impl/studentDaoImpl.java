package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import dao.studentDao;
import entity.student;
import utils.BaseDao;

public class studentDaoImpl implements studentDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	@Override
	public void query(student id) {
		//
		student st = null;
		  try {
		  // ������Ӷ���
		  conn = BaseDao.getConnection(); 
		  // ����Ҫִ�е�SQL���� 
		  String sql ="select * from studentMa where id=?"; 
		  // ʵ����ִ�ж��� 
		  pst =conn.prepareStatement(sql); 
		  // ��Ϊû�в��������Կ���ֱ�ӵ��÷��� 
		  rs = pst.executeQuery(); // ��ý�����е����ݣ����������浽������ 
		  while(rs.next()) { // ��Ϊ���е�ÿһ�д���һ��ʵ����������ȴ���һ������������ÿһ������ 
			  st = new student();//���������һ���ն��� 
			  st.setName(rs.getString(2));
			  st.setAge(rs.getInt(3));; } } 
		  catch(SQLException e) { 
			  e.printStackTrace(); 
		  }
		  return; 
	}

}
