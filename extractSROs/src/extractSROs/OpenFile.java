package extractSROs;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;


public class OpenFile {
	//file must be placed on this path in order for the system to work 
	static String pathWay = "\\Users\\gab54\\OneDrive\\Documents\\JavaPractice\\";
	//this method receives the file name to be process 
static void Open( String File_name) {
	pathWay += File_name; // added to the path
	 File file = new File(pathWay);//Instantiate a file 
		if(!Desktop.isDesktopSupported()){
	        System.out.println("Desktop is not supported");
	    }
	Desktop desktop = Desktop.getDesktop(); //Instantiate a desktop 
	
	 if (file.isFile() && file.exists()) { // if file exist 
		 try {
			desktop.open(file); // this will open the file. 
		} catch (IOException e) {
			
			e.printStackTrace(); //catch any error
		}
	        System.out.println("File open"); //open the file
	
	    }
	    else {
	        System.out.println("File either not exist"
	                           + " or can't open");//if the file can't be open
	    }
	}
}


