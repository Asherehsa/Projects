//3.33 - 2/23
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Rice Shopping */

import java.util.*;
import java.util.Arrays;
public class Exercise03_33  {
	public static void main(String [] args)
	{

	//get user input (cost and weight of rice)
	System.out.println("Enter weight and price for package 1: ");
   Scanner input = new Scanner(System.in);
   int w1 = input.nextInt();
   double p1 = input.nextDouble();
   
	//Ask user to enter a guess
	System.out.println("Enter weight and price for package 2: ");
   int w2 = input.nextInt();
   double p2 = input.nextDouble();
	//maths
p1 = p1/w1;
p2 = p2/w2;
   //print result
if (p1<p2)
	System.out.println("Package 1 has a better price");
else if (p1>p2)
   System.out.println("Package 2 has a better price");
else if (p1==p2)
   System.out.println("Both packages have the same price");
else
   System.out.println("What did you do?!");
	}
}