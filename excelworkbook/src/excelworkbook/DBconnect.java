package excelworkbook;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DBconnect {
	String uname;
	String pwd;
	String Tquery;
	ResultSet result;
	int rows;
	int columns;
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
			 result = statement.executeQuery(Tquery);
		}catch(SQLException e) {
			e.printStackTrace();
		}


	}
	
	public void display() {
		Object[][] resultSet = new Object[rows][columns];		
        int row = 0;
        
        try {
			for (int j = 1; j<resultSet.length;j++) {
				for (int i=1; i<=columns;i++) {
					resultSet[j][i] = result.getObject(i+1);
				}
				 row++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
        System.out.println(resultSet.length);
		/*try {
			while (result.next()) {
				String Fo = "";
				for (int i=1; i<=columns;i++) {
					Fo += result.getString(i)+ "\t\t";
					resultSet[row][i] = result.getObject(i+1);
				}
				System.out.println(Fo);
				 row++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
		
		
	}
}
