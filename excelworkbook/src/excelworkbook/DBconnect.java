package excelworkbook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {
	String uname;
	String pwd;
	String Tquery;
	public DBconnect(String uname, String pwd, String Tquery){
		this.uname= uname;
		this.pwd=pwd;
		this.Tquery=Tquery;
	}

	public String connect(){
		String connected = "Connected to Database";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			String url ="jdbc:mysql://localhost:3306/userpractice";
			Connection connect = DriverManager.getConnection(url, uname, pwd);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connected;
	}
	
}
