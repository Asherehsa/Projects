//3.17 - 2/19
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Rock Paper Scissors */

import java.util.*;
public class Exercise03_17  {
	public static void main(String [] args)
	{
	//generate a random num
	int rand = (int) (Math.random()*3);
   System.out.println("rundom numbar " + rand);
//0 = rock 1 = paper 2 = scissors
	System.out.println("Rock, Paper or Scissors? ");
   Scanner input = new Scanner(System.in);
   String guess = input.nextLine().toLowerCase();
	
   switch (guess) {
      case "rock":
      if (rand == 0){
	  System.out.println( guess +" vs rock: it is a tie!");
	  }
	  else if (rand == 1){
	  System.out.println( guess +" vs paper: you loose!");
	  }
	  else
	  System.out.println( guess +" vs scissors: you win!");
      break;
      case "paper": 
	  if (rand == 0)
	  System.out.println( guess +" vs rock: you win!");
     	  else if (rand == 1)
	  System.out.println( guess +" vs paper: a tie!");
	  else
	  System.out.println( guess +" vs scissors: you loose!");
      break;
      case "scissors": 
	  if (rand == 0)
	  System.out.println( guess +" vs rock: you loose!");
     	  else if (rand == 1)
	  System.out.println( guess +" vs paper: you win!");
	  else
	  System.out.println( guess +" vs scissors: it's a tie!");
      break;
     default: System.out.println("please enter rock paper or scissors");
     System.exit(1);
   }
	}
}
