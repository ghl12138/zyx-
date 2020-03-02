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
		  // 获得连接对象
		  conn = BaseDao.getConnection(); 
		  // 创建要执行的SQL命令 
		  String sql ="select * from studentMa where id=?"; 
		  // 实例化执行对象 
		  pst =conn.prepareStatement(sql); 
		  // 因为没有参数，所以可以直接调用方法 
		  rs = pst.executeQuery(); // 获得结果集中的数据，并将它保存到集合中 
		  while(rs.next()) { // 因为表中的每一行代表一个实体对象，所以先创建一个对象来保存每一行数据 
			  st = new student();//这个对象是一个空对象 
			  st.setName(rs.getString(2));
			  st.setAge(rs.getInt(3));; } } 
		  catch(SQLException e) { 
			  e.printStackTrace(); 
		  }
		  return; 
	}

}
