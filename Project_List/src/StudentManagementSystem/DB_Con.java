package StudentManagementSystem;

import java.sql.*;

public class DB_Con {

	public static Connection DBC() {
		
		Connection conn;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/dongyangdb";
			String username = "root";
			String password = "admin";
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("연결 성공");
			return conn;
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
			e.printStackTrace();
			return null;
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
			e.printStackTrace();
			return null;
		}
	}	
}
