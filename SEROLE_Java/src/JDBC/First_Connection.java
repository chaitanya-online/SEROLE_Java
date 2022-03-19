package JDBC;

import java.sql.*;

public class First_Connection {
	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/chaitanya";
		String username = "root";
		String query = "select Employee_Name from serole where id=2  ;";
		String password = "Admin";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("Employee_Name");
		System.out.println(name);
		st.close();
		con.close();
	}
}
