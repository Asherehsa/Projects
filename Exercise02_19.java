import java.util.Scanner;

public class Exercise02_19 {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double pts[]=new double[6];
		double side1, side2, side3, s, area;
	   //a = outside temp, v = speed, wc = wind chill temp
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Enter 3 pts for a triangle:");
for(int i=0;i<pts.length;i++){
		pts[i] = input.nextDouble();
}
//1=x1 2=y1 3=x2 4=y2 5=x3 6=y3
		//Find distance between the pts
		side1= Math.sqrt((pts[2] - pts[0])*(pts[2] - pts[0])+(pts[3] - pts[1])*(pts[3] - pts[1]));
		side2= Math.sqrt((pts[4] - pts[2])*(pts[4] - pts[2])+(pts[5] - pts[3])*(pts[5] - pts[3]));
		side3= Math.sqrt((pts[0]-pts[4])*(pts[0]-pts[4])+(pts[1]-pts[5])*(pts[1]-pts[5]));

      //more calculations
      s = (side1 + side2 + side3)/2;
      area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
            
		//Display Results
		System.out.print("Side 1, 2, 3, s then area! " + side1 + " " + side2 + " " + side3 + " " + s + " " + area);
}}