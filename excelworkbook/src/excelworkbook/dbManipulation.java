package excelworkbook;

import java.sql.SQLException;
import java.util.Scanner;



public class dbManipulation {
	public static void main(String[] arg) throws SQLException{
		Scanner UInput = new Scanner(System.in);
			System.out.println("Enter UserName");
				String uName = UInput.nextLine();
			System.out.println("Enter Password");
				String Passw = UInput.nextLine();
			System.out.println("Enter Query");
				String Query = UInput.nextLine();
		DBconnect conn = new DBconnect(uName, Passw, Query);
		System.out.println(conn.connect());
		
	}
}
