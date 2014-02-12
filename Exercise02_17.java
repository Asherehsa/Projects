//2.17 - 2/9
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Finds wind chill index given wind speed and temp */
import java.util.Scanner;

public class Exercise02_17 {
//wind chill~
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double a, v, wc;
	   //a = outside temp, v = speed, wc = wind chill temp
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Please enter a temperature in Fahrenheit between -58 and 41:");
		a = input.nextDouble();
		System.out.print("Enter the wind speed (over 2) in miles per hour:");
		v = input.nextDouble();
		//Compute
		
      wc = 35.74 + .6215 * a - 35.75 * Math.pow(v,.16) + .4275 * a * Math.pow(v,.16);
      
		//Display Results
		System.out.print("The wind chill index is " + wc);

}}
/*https://github.com/Asherehsa/Projects/blob/master/Exercise02_17.java
 ▄▄▄▄▄▄▄  ▄    ▄  ▄▄▄▄▄ ▄  ▄▄▄▄▄▄▄
 █ ▄▄▄ █ ▀█▄█▀▀ █   ▄██▄▄▄ █ ▄▄▄ █
 █ ███ █ ▀▀▄▀▄▄█▀▀▀▄█   ▄  █ ███ █
 █▄▄▄▄▄█ █ █ ▄▀█▀█ █ ▄ █ █ █▄▄▄▄▄█
 ▄▄▄▄▄ ▄▄▄▄▄ █▄▀█▀▄ ▀ ██▄█▄ ▄ ▄ ▄ 
  ▀ ▄▀ ▄█ █ ▄▄ ▀▄█▄▄▀██▀▀  ▀▄▄▄▀█▀
 ██  ██▄ ▀█▀█ ▄▀▄▄▄ █▀▀▄ ▄█▀▄█▄▀  
 ▄▄█▄▄█▄ ▀ ▀ ▀▄█▄█  ▀▀▀▀▀▄▄██▄  █▀
 ▀▀▀ █▀▄██▄█ █▄▀▀ ▄▀▄▀▀▄▀▀█▀█▄ ▀▄ 
 ▀▀▄██▀▄▄▄▀▄▄▄█▄▄█ ▀▀▀ ▄▀ ▄█  █ █▀
  ▀ ▀██▄ █▄▄█ ▄▄▄ ▄ ▀ ▀█ ▄▀  ▄ ▀▄ 
 █ ▀ ██▄ ▄██ ▀█ ▄▀▄▄▀█  ▀▄▄█▄ █ █▀
 █ ▄▄ █▄▀▄▀  █▄▄▄▄▄██▀▀▄▄█████▀▀ ▄
 ▄▄▄▄▄▄▄ █▄█▄▄  ▄██▀▀▄█▄▄█ ▄ ██▀▄▀
 █ ▄▄▄ █ ▄▄▄█▄▄██▀  ▀▄▀█▀█▄▄▄█▀▀▄ 
 █ ███ █ █▀▄ ▀▄█▄▀ ▀▀▀▀ ▀▄▀ ▀▀▄▄▄ 
 █▄▄▄▄▄█ █▀▄ █▄▄▀▄▄  █▀██▄▄ ▀ █▀▄ */