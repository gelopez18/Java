package extractSROs;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class extractInfo {
		public static void main(String[] arg) throws Exception{
			Scanner Uinput = new Scanner(System.in);
				System.out.println("Enter File's name:");
					String File = Uinput.next();
				OpenFile.Open(File);			
		}
	}


