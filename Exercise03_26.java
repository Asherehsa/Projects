//3.26 - 3/2
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Divisibility */

import java.util.*;
import java.util.Arrays;
public class Exercise03_26  {
	public static void main(String [] args)
	{

	//get user input
	System.out.println("Enter an integer: ");
   Scanner input = new Scanner(System.in);
   int num = input.nextInt();
   boolean bool;
   //print results
   bool = (num%5==0) && (num%6==0);
	System.out.println("Is " + num + " divisible by 5 and 6? " + bool);
    bool = (num%5==0) || (num%6==0);
    System.out.println("Is " + num + " divisible by 5 or 6? " + bool);
    bool = ((num%5==0) != (num%6==0)) && ((num%5==0) || (num%6==0));
    System.out.println("Is " + num + " divisible by 5 or 6, but not both? " + bool);
	}
}