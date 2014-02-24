//3.20 - 2/20
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Finds wind chill index given wind speed and temp unless invalid*/
import java.util.Scanner;
public class Exercise03_20  {
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
		if (v>=2&&a>=-58&&a<=41){
      wc = 35.74 + .6215 * a - 35.75 * Math.pow(v,.16) + .4275 * a * Math.pow(v,.16);
      System.out.print("The wind chill index is " + wc);
      }
      else
      System.out.print("Make sure wind speed is greater than 2 mph and the tempature is over -58 but under 41F");
      System.exit(1);
		//Display Results

}}