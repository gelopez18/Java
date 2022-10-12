package excelworkbook;

import java.io.File;
import java.io.IOException;

public class fileManipulation {
	String path;
	public fileManipulation(String Path) {	
		this.path = Path;
	}
	

	public boolean mkDir(String dirName) throws IOException {
		path += dirName;
		File fileNm = new File(path);
		boolean results = fileNm.mkdir();
		if(results) {
			System.out.println("file created");
		} else { System.out.println("file exist"); }
		return results;
	}
	
}
