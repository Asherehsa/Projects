//3.24 - 2/20
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Random card from a deck*/
import java.util.Scanner;
public class Exercise03_24  {
	/**MainMethod**/
	public static void main (String[] args) {
      final int numcards = 52;
      //Pick a card
  int number = (int) (Math.random()*numcards);
  System.out.print("The card you picked is ");
  if (number % 13 = 0)
   system.out.print("Ace")
   
   else if (number %13 ==11)
	system.out.print("queen of")
  else if (number %13 ==12)
	system.out.print("king of")
	else
	system.our.pring((number%13) of )
}}