//2.05 - 1/28
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* finds gratuity and total given gratuity rate and subtotal */
import java.util.Scanner;

public class Exercise02_05 {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double gratrate, gratotal, total, sub;
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Please enter the subtotal and gratutity rate:");
		sub = input.nextDouble();
		gratrate = input.nextDouble();
		
		//Compute
		
      gratotal = sub * gratrate * .01;
      total = sub + gratotal;
      
		//Display Results
		System.out.print("The gratuity is $" + gratotal + " and total is $" + total);

}}