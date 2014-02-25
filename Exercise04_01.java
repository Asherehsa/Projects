//4.1 - 2/24
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Area of a pentagon*/
import java.util.Scanner;
public class Exercise04_01  {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double s, r, a;
      int n;
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Enter length from the center to the vertex (r): ");
		r = input.nextDouble();
      n = 5;
		//Compute
      s = 2*r * Math.sin(Math.PI/n);
      a = ((5*Math.pow(s,2))/(4*((Math.tan(Math.PI/n)))));
		//Display Results
//      System.out.print(a);
      System.out.printf("The area of the pentagon is %.2f", a);

}}