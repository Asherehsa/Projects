//3.1 - 2/15
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Find roots of a quadratic equation */

import java.util.Scanner;

public class Exercise03_01  {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double a, b, c, dis, nroot, proot;
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Enter a, b & c:");
		a = input.nextDouble();
      b = input.nextDouble();
		c = input.nextDouble();

      //calculate the discriminant
      dis = (Math.pow(b,2)-4*a*c);
      //find the roots
      if (dis > 0.){
      proot = (-b + Math.pow(dis,.5))/(2.*a);
      nroot = (-b - Math.pow(dis,.5))/(2.*a);
      System.out.print("The equation has two roots " + proot + " & " + nroot);
      }
      else if (dis == 0.){
      proot = -b/(2.*a);
      System.out.print("The equation has one root " + proot);
      }
      else{
      System.out.print("The equation has no real roots");
      }
}}
