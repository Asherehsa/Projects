import java.util.Scanner;

public class Exercise02_17 {
//wind chill~
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double a, v, wc;
	   //a = outside temp, v = speed, wc = wind chill temp
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Please enter a temperature in Fahrenheit between -58 and 41:");
		a = input.nextDouble();
		System.out.print("Enter the wind speed (over 2) in miles per hour:");
		v = input.nextDouble();
		//Compute
		
      wc = 35.74 + .6215 * a - 35.75 * Math.pow(v,.16) + .4275 * a * Math.pow(v,.16);
      
		//Display Results
		System.out.print("The wind chill index is " + wc);

}}