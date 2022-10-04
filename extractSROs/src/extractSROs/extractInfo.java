	package extractSROs;
	import java.io.File;
	import java.io.IOException;

public class extractInfo {
		public static void main(String[] arg) throws Exception{
			String pathWay = "\\Users\\gab54\\OneDrive\\Documents\\JavaPractice\\";
			Path1 pth = new Path1(pathWay); //we instantiate a new object created in path under this same package and passed on the path
			pth.openFile("JavaFileTest.xls"); /*then the method needs to receive the name of the file
			so it can be added to the path and the IO package can open it*/
		}
	}


