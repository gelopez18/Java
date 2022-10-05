package extractSROs;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class extractInfo {
		public static void main(String[] arg) throws Exception{
			Scanner Uinput = new Scanner(System.in);
				System.out.println("Enter File's name:");
					String FileName = Uinput.next();
		// Create a file input stream on specified path with the created file
					 File file =  ModifyFile.Open(FileName);
			FileInputStream fis = new FileInputStream(file); 
				System.out.println(fis.getChannel());
				System.out.println(fis.getFD());
				System.out.println("Number of remaining bytes:"
                        + fis.available());
				
				fis.skip(4);
				System.out.println("FileContents :");
				int ch;
				while ((ch = fis.read()) != -1)
		            System.out.print((char)ch);
				 fis.close();
				 ModifyFile.Close(FileName);
				 
		}
	}


