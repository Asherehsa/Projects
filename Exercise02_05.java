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