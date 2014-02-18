//3.14 - 2/15
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Coin flip */

import java.util.Scanner;
import java.util.Random;

public class Exercise03_14  {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		String guess;
      boolean ran;
		//Create Scanner
		Scanner input = new Scanner(System.in);
		//Read in values
		System.out.print("guess heads or tales:");
		guess = input.nextLine();
      ran = Math.random() < 0.5;
if (guess.compareToIgnoreCase("heads")==0){
   System.out.print((ran=true) ? "The coin was heads, you were right!"  :  "The coin was tails, you were wrong D:");
}
else if (guess.compareToIgnoreCase("tails")==0){
   System.out.print((ran=false) ? "The coin was tails, you were right!"  :  "The coin was heads, you were wrong D:");
}
else{
System.out.print("You failed to type heads or tails");
}
  }}