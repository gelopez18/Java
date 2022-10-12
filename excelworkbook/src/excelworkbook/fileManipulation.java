package excelworkbook;

import java.io.File;
import java.io.IOException;

public class fileManipulation {
	String path = "\\Users\\gab54\\OneDrive\\Documents\\JavaPractice\\";

	public boolean mkDir(String dirName) throws IOException {
		path += dirName;
		File fileNm = new File(path);
		boolean results = fileNm.createNewFile();
		if(results) {
			System.out.println("file created");
		} else { System.out.println("file exist"); }
		return results;
	}
	
}
