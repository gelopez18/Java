package excelworkbook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {
	String uname;
	String pwd;
	String Tquery;
	public DBconnect(String uname, String pwd){
		this.uname= uname;
		this.pwd=pwd;

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
	
	public void Query(String Query) {
		this.Tquery=Query;
		try {
			String url ="jdbc:mysql://localhost:3306/userpractice";
			Connection connect = DriverManager.getConnection(url, uname, pwd);
			Statement statement = connect.createStatement();
			ResultSet result = statement.executeQuery(Tquery);
			while (result.next()) {
				String Fo = "";
				for (int i=1; i<=5;i++) {
					Fo += result.getString(i)+ "\t\t";
				}
				System.out.println(Fo);
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		

	}
	
	public void display() {

	}
}
