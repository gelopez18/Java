package extractSROs;
import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;


public class extractInfo {
		public static void main(String[] arg) throws Exception{
			Scanner Uinput = new Scanner(System.in);
				System.out.println("Enter File's name:");
					String FileName = Uinput.next();
		// Create a file input stream on specified path with the created file
					 File file =  ModifyFile.Open(FileName);
				        PDFManager pdfManager = new PDFManager();
				        pdfManager.setFilePath(file);
				        try {
				            String text = pdfManager.toText();
				            System.out.println(text);
				        } catch (IOException ex) {
				            Logger.getLogger(PDFBoxReadFromFile.class.getName()).log(Level.SEVERE, null, ex);
				        }
				 
		}
	}


