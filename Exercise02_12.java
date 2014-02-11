import java.util.Scanner;

public class Exercise02_12 {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double v, a, length;
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Please enter speed (v) and acceleration:");
		v = input.nextDouble();
		a = input.nextDouble();
		
		//Compute
		
      length = Math.pow(v,2);
      length = length/(2*a);
      
		//Display Results
		System.out.print("The minimum runway length for this airplane is " + length + " meters.");

}}