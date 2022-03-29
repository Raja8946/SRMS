package Project;
import java.sql.*;
public class ConnectionProvider {

	public static Connection getCon()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/STUDENTS","root","password");
			return con;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getStackTrace());
			return null;
		}
	}
}
