package extractSROs;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class extractInfo {
		public static void main(String[] arg) throws Exception{
					String pathWay = "\\Users\\gab54\\OneDrive\\Documents\\JavaPractice\\";
			Scanner Uinput = new Scanner(System.in);
				System.out.println("Enter File's name:");
					String File = Uinput.next();

					pathWay += File;

			File file = new File(pathWay);
					if(!Desktop.isDesktopSupported()){
			            System.out.println("Desktop is not supported");
			        }
			Desktop desktop = Desktop.getDesktop();
		      
				 if (file.isFile() && file.exists()) {
					 desktop.open(file);
			            System.out.println("File open");
			        }
			        else {
			            System.out.println("File either not exist"
			                               + " or can't open");
			        }
		}
	}


