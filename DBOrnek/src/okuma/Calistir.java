package okuma;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class Calistir {
	public static void main(String[] args) throws Exception {
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("org.postgresql.Driver");

			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/visne", "postgres", "postgres123");
			int id = 1;
			stmt = conn.prepareStatement("select * from public.user where id = ?");
			stmt.setInt(1, id);
			rs = stmt.executeQuery();
			while (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				int yas = rs.getInt("age");
				Timestamp loginDate = rs.getTimestamp("last_login_date");
				System.out.println(username + "," + password + "," + yas + "," + loginDate);
			}
		} finally {
			try {
				rs.close();
			} finally {
				try {
					stmt.close();
				} finally {
					conn.close();
				}
			}
		}
	}
}
