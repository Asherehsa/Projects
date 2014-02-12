//2.19 - 2/9
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* finds area of a triangle given 3 points */

import java.util.Scanner;

public class Exercise02_19 {
	/**MainMethod**/
	public static void main (String[] args) {
					
		//Declare Variables
		double pts[]=new double[6];
		double side1, side2, side3, s, area;
		//Create Scanner
		Scanner input = new Scanner(System.in);
		
		//Read in values
		System.out.print("Enter 3 ordered pairs for a triangle:");
for(int i=0;i<pts.length;i++){
		pts[i] = input.nextDouble();
}
//1=x1 2=y1 3=x2 4=y2 5=x3 6=y3
		//Find distance between the pts
		side1= Math.sqrt((pts[2] - pts[0])*(pts[2] - pts[0])+(pts[3] - pts[1])*(pts[3] - pts[1]));
		side2= Math.sqrt((pts[4] - pts[2])*(pts[4] - pts[2])+(pts[5] - pts[3])*(pts[5] - pts[3]));
		side3= Math.sqrt((pts[0]-pts[4])*(pts[0]-pts[4])+(pts[1]-pts[5])*(pts[1]-pts[5]));

      //more calculations
      s = (side1 + side2 + side3)/2;
      area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
            
		//Display Results
		System.out.print("Side 1, 2, 3, s then area! " + side1 + " " + side2 + " " + side3 + " " + s + " " + area);
}}
/*https://github.com/Asherehsa/Projects/blob/master/Exercise02_19.java
 ▄▄▄▄▄▄▄  ▄▄▄ ▄  ▄ ▄  ▄▄   ▄▄▄▄▄▄▄
 █ ▄▄▄ █  ▄▄█▀▀ ▄   ▄█▄▄▄▄ █ ▄▄▄ █
 █ ███ █ █ █▀▄▄▄  ▀▄█▀▀▀▄  █ ███ █
 █▄▄▄▄▄█ ▄▀█ ▄▀█ █ █ ▄▀█ █ █▄▄▄▄▄█
 ▄▄   ▄▄▄ █▄ █▄▀▄▀▄ ▀ ▄█▄█   ▄▄   
 █▀█▀▀█▄ ▄▄▀▄▄  █▄▄▄▀▄▄ ▀   ██▄▀█ 
  ▀▄  ▀▄▄▄▄█▀  ██   ▀█  ▄▄▀██▀ ▀▄▄
 ████ █▄▄▄▀█ ▀▀▀██  ▀▀ ▀▀▄▄█▄▄  █▀
 ▀█▀█▀ ▄▀▀▀█ █▄  ▀▄▀▄  █▀▀█ ▄█ ▀▄▀
  ▀▀ ▄▀▄▄▄▀  ▄▀ █▀▄▀██▀ █  ▀▀▄▀ ▀█
 ▀▀▄▄ ▄▄▀██▀█ ▄▄█ ▄ ▀  █ ▄▀ ▀▄ ▀▄ 
 █ ▄▀ █▄▀    ▀█▀█ ▄▄▀▄▀▀▀▄▄▄█▀█ █ 
 █▄▄▄██▄▀▀▀▄▄█  █  █▀█   ███▄██▀▄ 
 ▄▄▄▄▄▄▄ ██ ▄▄  ███▀▀▄▄▄▄█ ▄ ██▀▄▀
 █ ▄▄▄ █ ▀█▄█▄▄▄▄   ▀█ ▄▀█▄▄▄█▀▀▄▀
 █ ███ █  ▀ ▄▀ ▀██▄▀██ ▄█▄█▄ █ ▄ ▄
 █▄▄▄▄▄█ █▄█ █▄▄ ▄▄  █ ██▄▄   █▀▄ */