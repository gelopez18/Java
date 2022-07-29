import java.util.HashMap;
public class testClass {
	
		int wallAmount;
		String WallLoc;
		String WallType;
		double WallHeight;
		double wallLength;
		HashMap <String, String> totalWalls ;
		int totalOfBricks; 
		
		public testClass(int wallAmount, String WallLoc, String WallType, double WallHeight, double wallLength, HashMap <String, String> Brickstype) {
			
			this.wallAmount = wallAmount;
			this.WallLoc = WallLoc;
			this.WallType= WallType;
			this.WallHeight = WallHeight;
			this.wallLength = wallLength;
			this.totalWalls = Brickstype;
		}

		public int getWallAmount() {
			return wallAmount;
		}

		public void setWallAmount(int wallAmount) {
			this.wallAmount = wallAmount;
		}

		public String getWallLoc() {
			return WallLoc;
		}

		public void setWallLoc(String wallLoc) {
			WallLoc = wallLoc;
		}

		public String getWallType() {
			return WallType;
		}

		public void setWallType(String wallType) {
			WallType = wallType;
		}

		public double getWallHeight() {
			return WallHeight;
		}

		public void setWallHeight(double wallHeight) {
			WallHeight = wallHeight;
		}

		public double getWallLength() {
			return wallLength;
		}

		public void setWallLength(double wallLength) {
			this.wallLength = wallLength;
		}

		public HashMap<String, String> gettotalWalls() {
			return totalWalls;
		}

		public void settotalWalls(HashMap<String, String> brickstype) {
			totalWalls = brickstype;
		}
		public void display() {
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("\t"+"Wall's Locations"+"\t\t"+"Height - Width");
			System.out.println("------------------------------------------------------------------------------------");
			gettotalWalls().forEach((K, V) -> System.out.println("\t\t"+K+"\t\t\t"+V));
			System.out.println("------------------------------------------------------------------------------------");
		}
		
	}



