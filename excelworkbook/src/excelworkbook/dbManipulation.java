package excelworkbook;

import java.sql.SQLException;
import java.util.Scanner;



public class dbManipulation {
	public static void main(String[] arg) throws SQLException{
		Scanner UInput = new Scanner(System.in);
			String uName = UInput.next();
			String Passw = UInput.next();
		DBconnect conn = new DBconnect(uName, Passw, Query);
		
	}
}
