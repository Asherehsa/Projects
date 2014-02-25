//4.2 - 2/24
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Great Circle Distance*/
import java.util.Scanner;
public class Exercise04_02  {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double x1, y1, x2, y2, d, radius;
      int n;
		//Create Scanner
	Scanner input = new Scanner(System.in);
   //lots of input!
   System.out.print("Enter first point x value (latitude): ");
   while (!input.hasNextDouble()) {
   System.out.print("Not a number, please try again: ");
   input.next();
   }
   x1 = Math.toRadians(input.nextDouble());
   System.out.print("Enter first point y value (longitude): ");
   while (!input.hasNextDouble()){
   System.out.print("Not a number, please try again: ");
   input.next();
   }
   y1 = Math.toRadians(input.nextDouble());
   System.out.print("Enter second point x value (latitude): ");
   while (!input.hasNextDouble()){
   System.out.print("Not a number, please try again: ");
   input.next();
   }
   x2 = Math.toRadians(input.nextDouble());
   System.out.print("Enter second point y value (longitude): ");
   while (!input.hasNextDouble()){
   System.out.print("Not a number, please try again: ");
   input.next();
   }
   y2 = Math.toRadians(input.nextDouble());
   radius = 6371.01;
		//Compute
   d = radius * Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
		//Display Results
//      System.out.print(a);
      System.out.printf("The distance between the two points is %f km", d);

}}