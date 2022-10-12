package excelworkbook;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;



public class dbManipulation {
	public static void main(String[] arg) throws SQLException, IOException{
		Scanner UInput = new Scanner(System.in);
			System.out.println("Enter UserName");
				String uName = UInput.nextLine();
			System.out.println("Enter Password");
				String Passw = UInput.nextLine();

		DBconnect conn = new DBconnect(uName, Passw);
		if(conn.connect()=="Connected to Database") {
			System.out.println(conn.connect());
			System.out.println("Enter Query");
				String Query = UInput.nextLine();
			 conn.Query(Query);
			 conn.display();
			 fileManipulation file = new fileManipulation();
			 LocalDate date = LocalDate.now();
			 	file.mkDir(uName+=date);
		
		}
		
		
		
	}
}
