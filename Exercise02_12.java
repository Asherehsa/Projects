//2.02 - 2/5
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* finds how long a runway should be for a plane to take off */
import java.util.Scanner;

public class Exercise02_12 {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double v, a, length;
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Please enter speed (v) and acceleration:");
		v = input.nextDouble();
		a = input.nextDouble();
		
		//Compute
		
      length = Math.pow(v,2);
      length = length/(2*a);
      
		//Display Results
		System.out.print("The minimum runway length for this airplane is " + length + " meters.");

}}
/*https://github.com/Asherehsa/Projects/blob/master/Exercise02_12.java
 ▄▄▄▄▄▄▄  ▄    ▄  ▄▄▄▄▄ ▄  ▄▄▄▄▄▄▄
 █ ▄▄▄ █ ▀█▄█▀▀ █   ▄██▄▄▄ █ ▄▄▄ █
 █ ███ █ ▀▀▄▀▄▄█▀▀▀▄█   ▄  █ ███ █
 █▄▄▄▄▄█ █ █ ▄▀█▀█ █ ▄ █ █ █▄▄▄▄▄█
 ▄▄▄▄▄ ▄▄▄▄▄ █▄▀█▀▄ ▀ ██▄█▄ ▄ ▄ ▄ 
 ▄ █ █▀▄▄██ ▄▄ ▀▄█▄▄▀██▀▀  ▀▄▄▄▀█▀
 █▄ ▀▀█▄▄ █▀█ ▄▀▄▄▄ █▀▀▄ ▄█▀▄█▄▀  
 █  █  ▄ ▄▀▀ ▀▄▀▄█  ▀▀▀▀▀▄▄██▄  █▀
 ▄██▀▄▄▄▀█▀▀ █▄ ▀ ▄▀▄▀▀▄▀▀█▀█▄ ▀▄ 
 █ ▄▄ █▄▄▄▄▄▄▄█▄▄█ ▀▀▀ ▄▀ ▄█  █ █▀
 ▄▀▀█▀█▄▀▀█▄█ ▄▄▄ ▄ ▀ ▀█ ▄▀  ▄ ▀▄ 
 █▀ █ █▄ ▄▄▀ ▀█ ▄▀▄▄▀█  ▀▄▄█▄ █ █▀
 █ ▄ ▄█▄▀██▄ █▄▄▄▄▄██▀▀▄▄█████▀▀ ▄
 ▄▄▄▄▄▄▄ █▀▀▄▄  ▄██▀▀▄█▄▄█ ▄ ██▀▄▀
 █ ▄▄▄ █ ▄  █▄▄██▀  ▀▄▀█▀█▄▄▄█▀▀▄ 
 █ ███ █ █▀▄ ▀▄█▄▀ ▀▀▀▀ ▀▄▀ ▀▀▄▄▄ 
 █▄▄▄▄▄█ █▀█ █▄▄▀▄▄  █▀██▄▄ ▀ █▀▄ */