//3.15 - 2/17
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Gambling! */

import java.util.*;
import java.util.Arrays;
public class Exercise03_15  {
	public static void main(String [] args)
	{
	//Randomly generate lottery number
	int lottery = (int) (Math.random()*1000);
	
	//Display lottery number
	System.out.println("The Lotto # is " + lottery);
	//Parse lottery number into individual digits
	ArrayList ln = new ArrayList(); 
	ln.add(lottery/100);
	ln.add((lottery%100)/10);
	ln.add(lottery%10);
   
	//Ask user to enter a guess
	System.out.println("Please enter three digits");
   Scanner input = new Scanner(System.in);
   int guess = input.nextInt();
	//Parse the guess into its digits
	ArrayList gn = new ArrayList(); 
	gn.add(guess/100);
	gn.add((guess%100)/10);
	gn.add(guess%10);
   //find matches and dedup
   gn.retainAll(ln);
   HashSet correct = new HashSet(gn);
   System.out.println(correct.size());
   //Did user win $10,000
	if (guess == lottery) {
	System.out.println("All the numbers were right! You won 10k!");
	}
   //Did user win $3,000
	else if (correct.size() == 2) {
	System.out.println(correct + " were right! You won 3k!");
	}
	//Did user win $1,000
	else if (correct.size() == 1) {
	System.out.println(correct + " was right! You won 1k!");
	}
	//Let the user know they didn't win anything
   else System.out.println("None of your guesses were correct, please try again. :c");
	}
}