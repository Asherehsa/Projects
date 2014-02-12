//2.02 - 2/5
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* finds area and volume */
import java.util.Scanner;

public class Exercise02_02 {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double area, volume, radius, length;
		
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Please enter the radius and length:");
		radius = input.nextDouble();
		length = input.nextDouble();
		
		//Compute and Display Results
		area = Math.pow(radius,2) * Math.PI;
		
			//Display Results
		System.out.println(area);
		volume = area * length;
		System.out.println(volume);
}}
/*https://github.com/Asherehsa/Projects/blob/master/Exercise02_02.java
 ▄▄▄▄▄▄▄ ▄▄▄▄ ▄  ▄ ▄  ▄▄   ▄▄▄▄▄▄▄
 █ ▄▄▄ █  ▄ █▀▄▀▄▄  ▀▄▄ ▄▄ █ ▄▄▄ █
 █ ███ █   ██▄▄   █▄██▀▀   █ ███ █
 █▄▄▄▄▄█ ▄▀▄▀▄▀█ ▄▀█ ▄▀▄▀█ █▄▄▄▄▄█
 ▄▄ ▄▄ ▄ ▀█  █▀ ▄█▄ ▄▀▄▀▄█ ▄     ▄
 ▄ █▀▀▄▄█▀▄▀ ▄ ▄█▄ ▄▀ ▄ █  ▄██ ▀█▄
 ▄▀█ █ ▄ ▄▄▄   ▄█▀▀ ▀█ ▀█▄▀██ ▀▀▄▄
 ▀▄▄▄▄▀▄█ ▄█ ▀▀ █▀  ▄  █▀▄▀▄▄     
  ▄█▄▀█▄ █ █▄█▄█ ▀ ▀▄▄ ██▀█▄▄█▄▀▄█
 █▀  ▀ ▄▄ █▀▀▄▀ █ █▀██▀▀▄  ▀▀█  ▀█
  ▄▀██▀▄  ▄▄█ ▀██▄▄ ▄▀ ▀ ▄▄▀▀  ▀▀▀
 █▀  █▄▄▄█▀▄▄▀███  ▄▀ ▀▀█▄▄ █▀▀ █▄
 █▄ ▄ ▄▄▀▄▀▄██  █▀▀█▀█ ▀▀███▄▄▄▀▄ 
 ▄▄▄▄▄▄▄ ▀▄▄▄▄█▀█▀█▀▄█▄ ▄█ ▄ ██▀▀ 
 █ ▄▄▄ █ ▄ █▀▄▄ ▄ ▄ ▀▀ ▄██▄▄▄██▀▄█
 █ ███ █ ▀▄██▀ ▀█▄█▀██ █▄▄█▄ ▄▀▄ ▄
 █▄▄▄▄▄█ █ ▀ █▀█  ▄ █▄ ▀█▄▀▀ ▄█▀▀▀*/