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
		//Step 1: Attach a file to a FileInputStream as this will enable us to read data from the file as shown below as follows:		 
			FileInputStream fis = new FileInputStream(file);
			// Illustrating getChannel() method
				System.out.println(fis.getChannel());
				  // Illustrating getFD() method
				System.out.println(fis.getFD());
				// Illustrating available method
				System.out.println("Number of remaining bytes:"
                        + fis.available());
				// Illustrating skip() method
				fis.skip(4);
				System.out.println("FileContents :");
				 
		        // Reading characters from FileInputStream
		        // and write them
				int ch;
				/*fis.read() Step 2: Now in order to read data from the file, 
				 * we should read data from the FileInputStream as shown below:
				 */
				
				// Holds true till there is data inside file
				while ((ch = fis.read()) != -1) //Step 3-A: When there is no more data available to read further, the read() method returns -1; 
		            System.out.print((char)ch);
				 fis.close();
				 ModifyFile.Close(FileName);
				 
		}
	}


