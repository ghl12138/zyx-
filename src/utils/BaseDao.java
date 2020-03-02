package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	private static Connection conn;
	// 获得连接的方法
	public static Connection getConnection() {
		try {
			// 加载jdbc驱动包
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/studentM?"
					+ "UseUnicode=true&characterEncoding=UTF-8", 
					"root", "1234");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
