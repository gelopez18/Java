import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class ConnectSQL {
	public static void main(String[] arg) throws SQLException{
		String url ="jdbc:mysql://localhost:3306/fmdb";
		String uname ="fpan004";
		String pwd = "22443"; 
		String Tquery = "select * from franchown;";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection(url, uname, pwd);
		 /* this following statement needs an specific class be imported from the 
			 * SQL class  
			 * Import java.sql.PreparedStatement;
			 */
			@SuppressWarnings("resource")
			/* this script is to input data to a data table in a SQLDB
			  we first need to create a variable to carry the query.*/ 
			Scanner uinput = new Scanner(System.in);
			String query = "insert into franchown(fo_id, f_name, l_name, fo_email, psw) values (?, ?, ?, ?, ?);";
			PreparedStatement inputStmt = connect.prepareStatement(query);
			
			System.out.println("FO Id");
			String fo_id = uinput.next();
			
			
			System.out.println("f_name");
			String f_name = uinput.next();
			
			
			System.out.println("l_name");
			String l_name = uinput.next();
			
			
			System.out.println("fo_email");
			String fo_email = uinput.next();
			
			
			System.out.println("psw");
			String psw = uinput.next();
			// create the MYSQL insert PreparedStatement
			inputStmt.setString(1, fo_id);
			inputStmt.setString(2, f_name);
			inputStmt.setString(3, l_name);
			inputStmt.setString(4, fo_email);
			inputStmt.setString(5, psw);	
			  // execute the preparedstatement
			inputStmt.execute();
	      
			// to query the table we need to run the following 

			Statement statement = connect.createStatement();
			ResultSet result = statement.executeQuery(Tquery);
			
			while (result.next()) {
				String FranchiseTable = "";
				for (int i =1 ; i<=5;i++) {
					FranchiseTable += result.getString(i) +":\n";
				}
				System.out.println(FranchiseTable);
			}
			System.out.println("Enter FO ID to search");
			String SearchFo = uinput.next(); 
			String QuerySearch = "Select * from franchown where fo_id='"+SearchFo+"';";
			ResultSet ResultSearch = statement.executeQuery(QuerySearch);
			
			while (ResultSearch.next()) {
				String Fo = "";
				for (int i=1; i<=5;i++) {
					Fo += ResultSearch.getString(i)+ "\t\t";
				}
				System.out.println(Fo);
			}
			connect.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
