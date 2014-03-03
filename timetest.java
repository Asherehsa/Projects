//3.33 - 2/23
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Display le hour */

import java.util.Scanner;

public class timetest {
	public static void main(String [] args)
	{

	//get user input (cost and weight of rice)
	System.out.println("Enter your GMT ofset (ei: -5): ");
   Scanner input = new Scanner(System.in);
        long totalMilliSeconds=System.currentTimeMillis();  
        long totalSeconds=totalMilliSeconds/1000;  
        int second=(int)(totalSeconds%60);  
        long totalMinutes=totalSeconds/60;  
        int minute=(int)(totalMinutes%60);  
        long totalHours=totalMinutes/60;  
        int hour=(int)((totalHours - 8)%24);  
        //print result
	System.out.println("The current time is: "+ hour + ":" + minute + ":" + second);
	}
}