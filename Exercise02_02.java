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
