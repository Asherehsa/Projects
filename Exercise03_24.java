//3.24 - 2/20
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Random card from a deck*/
import java.util.Scanner;
public class Exercise03_24  {
	/**MainMethod**/
	public static void main (String[] args) {
   String rank = "";
   String suit = "";
      //Pick a card
  int four = (int) (Math.random()*5);
  int numb  = (int) (Math.random()*14);
//num to string
        switch (four) {
      case 1:
          suit = "Clubs";
      break;
      case 2:
          suit = "Diamonds";
      break;
      case 3:
          suit = "Hearts";
          break;
      case 4:
          suit = "Spades";
          break;
  }
   switch (numb) {
       case 1:
           rank = "Ace";
           break;
       case 2:
           rank = "Two";
           break;
       case 3:
           rank = "Three";
           break;
       case 4:
           rank = "Four";
           break;
       case 5:
           rank = "Five";
           break;
       case 6:
           rank = "Six";
           break;
       case 7:
           rank = "Seven";
           break;
       case 8:
           rank = "Eight";
           break;
       case 9:
           rank = "Nine";
           break;
       case 10:
           rank = "Ten";
           break;
       case 11:
           rank = "Jack";
           break;
       case 12:
           rank = "Queen";
           break;
       case 13:
           rank = "King";
           break;
   }
   //print!
   System.out.printf("The card you picked is %s of %s", rank, suit);
}}