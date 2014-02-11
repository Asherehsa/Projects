//2.21 - 2/9 
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Calculate future investment value */

import java.util.Scanner;

public class Exercise02_23 {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double ia, air, years, fiv;
	   //ia = investment amount, air = anual investment rate, years = # of years, fiv = future investment value
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Enter investment amount:");
		ia = input.nextDouble();
		System.out.print("Enter yearly interest rate %:");
      air = input.nextDouble();
		System.out.print("Enter numbah of years:");
		years = input.nextDouble();

      //calculations!
      fiv = ia*(Math.pow((1+(air/12)),(years*12)));
		//Display Results
		System.out.print("Future investment value: " + fiv);
}}