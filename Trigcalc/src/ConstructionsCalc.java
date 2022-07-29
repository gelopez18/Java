
import java.text.*;
import java.util.*;
public class ConstructionsCalc {
	public ConstructionsCalc(char calculation) {
		if(calculation =='b' || calculation =='B') {
			BrickCalc();
		}else if(calculation =='R' || calculation =='r'){
			;
		}else if(calculation =='A' || calculation =='a') {
			;
		}
	}
	public void BrickCalc() {
		@SuppressWarnings("resource")
		Scanner uInput = new Scanner(System.in);
		NumberFormat formatter = new DecimalFormat("#0.0000");		
			String OtherBrick;
			double width = 0;
			double length = 0;
			double height = 0;
			String type ="";
			String BricksVol="";
			String BricksMeasu="";
			HashMap<String, String> BricksDetails = new HashMap<String, String>();
			HashMap<String, String> OneSqrM = new HashMap<String, String>();			
		do {	
		//instantiate an object for bricks 
		Bricks brick = new Bricks(width, length, height, type, BricksVol, BricksMeasu, OneSqrM, BricksDetails);
		//Create an array to store the measurement of the brick
		double[] bMeasurement = new double[3];
		//collect data of the type of brick
		System.out.println("What type of Brick you will use?");
		 brick.setType(uInput.next());
		System.out.println("Enter Bricks diamenssion in mm.\nDo you need to convert your measurements?");	
			String convert =uInput.next();
				if(convert.equals("yes")||convert.equals("YES")||convert.equals("Yes")) {
					System.out.println("Please choose the metric system you want to convert from.\n\tFrom inches to mm: I\n\tFrom Centimeters to mm: C");
					char metric = uInput.next().charAt(0);
					if(metric == 'i' ||metric == 'I') {
						double OneSqM;
						double Iwidth = uInput.nextDouble();
						double Ilength =uInput.nextDouble();
						double Iheight =uInput.nextDouble();
						//We need to send the data collected to the constructor's Methods
						 brick.setWidth(Iwidth*25.4);
						 brick.setLength(Ilength*25.4);
						 brick.setHeight(Iheight*25.4);
						 /*Once we have send the information to allocate in objs variables 
						 we can get the information to allocate it in the array*/
						 	bMeasurement[0] = brick.getWidth();
							bMeasurement[1] = brick.getLength();
							bMeasurement[2] = brick.getHeight();
							/*it is easier to hashMap a string so we make the array a string 
							once we have added the values in the array*/
							String BricksMeas = Arrays.toString(bMeasurement);
							/*calculate the volume on one brick and parse the result since its
							 * store in a double variable, and then we will passed this to a 
							 * hashMap to store the information 
							 */
							double volume =brick.getWidth() * brick.getLength() * brick.getHeight();
							OneSqM = (((volume)/(volume+10))*100)+((((volume)/(volume+10))*100)*.1);
							String brickVol = String.valueOf(formatter.format(OneSqM));
							/*put the type of brick as key and the array and volume as a value
							 * on the two hashmap created before. 
							 */
						 	BricksDetails.put(brick.getType(), BricksMeas+"\n");			
						 	OneSqrM.put(brick.getType(), brickVol+"\n");
					}else if(metric == 'c' ||metric == 'C') {
						//we repeat the process for centimeters
						double OneSqM;
						double Cwidth=uInput.nextDouble();
						double Clength =uInput.nextDouble();
						double Cheight =uInput.nextDouble();			
						brick.setWidth(Cwidth*25.4);
						 brick.setLength(Clength*25.4);
						 brick.setHeight(Cheight*25.4);					 
						 	bMeasurement[0] = brick.getWidth();
							bMeasurement[1] = brick.getLength();
							bMeasurement[2] = brick.getHeight();
							String BricksMeas = Arrays.toString(bMeasurement);					
							double volume =brick.getWidth() * brick.getLength() * brick.getHeight();
							OneSqM = (((volume)/(volume+10))*100)+((((volume)/(volume+10))*100)*.1);
							String brickVol = String.valueOf(formatter.format(OneSqM));				
						 	BricksDetails.put(brick.getType(),BricksMeas+"\n");			
						 	OneSqrM.put(brick.getType(), brickVol+"\n");
					}
				} 
					/*Once the information has been passed correctly to the hasMap created
					 * before, then they can be passed to the obj
					 */
						brick.setBricksDetails(BricksDetails);
						brick.setOneSqrM(OneSqrM);							
		//call and display the object 		
				brick.display();
			System.out.println("Do you want to add another type of Brick?");
				OtherBrick = uInput.next();
		}while(OtherBrick.equals("yes") ||OtherBrick.equals("YES") || OtherBrick.equals("Yes"));
		//bricks used in a wall instantiate an obj 		
		int wallAmount =0;
		String WallLoc= "";
		String WallType="";
		double WallHeight=0.0;
		double wallLength=0.0;	
		HashMap <String, String> totalWalls = new HashMap<String, String>() ;
		double totalOfBricks; 
		//instantiate an object for a wall 
		walls newWall = new walls(wallAmount, WallLoc, WallType, WallHeight, wallLength, totalWalls );
	System.out.println("how many walls ar there to be build");
		wallAmount = uInput.nextInt();
		newWall.setWallAmount(wallAmount);
			/*in order to organize the information we will set the measurement 
			 * for each wall in an array and hashMap this to the location as a key
			 */
				for(int i=0;i<wallAmount;i++) {
					/*so the each array can correlate to each key's location
					 *  we need to make sure this inside the for loop so it 
					 *  run as long as the amount input for the walls. 
					 */
					String[] HeightWidth = new String[4];
					System.out.println("Wall location (N - S - E - W - NE - NW - SE - SW):");
						WallLoc = uInput.next();
					System.out.println("Please enter the Height for the wall");
						HeightWidth[0] = String.valueOf(uInput.nextDouble());
					System.out.println("Please enter the width for the wall");
						HeightWidth[1] = String.valueOf(uInput.nextDouble());
					System.out.println("Type of wall\n\t1-Half Brick\n\t2-One Brick\n\t3-Single brick piers in half brick walls\n\t4-One and a half brick piers in a half brick wall");
						int typeOfWall = uInput.nextInt();
					if (typeOfWall == 1) {
						HeightWidth[2] = "Half Brick wall";
						totalOfBricks = Double.valueOf(HeightWidth[0])*Double.valueOf(HeightWidth[1])*60;
						HeightWidth[3] = String.valueOf(totalOfBricks);
					} else if (typeOfWall == 2) {
						HeightWidth[2] = "One Brick wall";
						totalOfBricks = Double.valueOf(HeightWidth[0])*Double.valueOf(HeightWidth[1])*120;
						HeightWidth[3] = String.valueOf(totalOfBricks);
					}else if (typeOfWall == 3) {
						HeightWidth[2] = "Single brick piers in half brick wall";
						totalOfBricks = Double.valueOf(HeightWidth[0])*Double.valueOf(HeightWidth[1])*14;
						HeightWidth[3] = String.valueOf(totalOfBricks);
					}else if (typeOfWall == 4) {
						HeightWidth[2] = "One and a half brick piers in a half brick wall";
						totalOfBricks = Double.valueOf(HeightWidth[0])*Double.valueOf(HeightWidth[1])*34;
						HeightWidth[3] = String.valueOf(totalOfBricks);
					}
						totalWalls.put(WallLoc, Arrays.toString(HeightWidth));
						
			}
				//call the display the method from the wall obj
			newWall.display();
			
		
					
	}
}

