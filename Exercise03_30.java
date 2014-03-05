//3.33 - 2/23
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Display le hour */

import java.util.Scanner;
   
public class Exercise03_30 {
	public static void main(String [] args)
	{

	//get user input
	System.out.println("Enter your GMT ofset (ei: -5): ");
   Scanner input = new Scanner(System.in);
   int gmt = input.nextInt();
   long mills=System.currentTimeMillis();
   long totalsec=mills/1000;
   int sec=(int)(totalsec%60);
   long totalMin=totalsec/60;
   int min = (int) (totalMin%60);
   long totalHour = totalMin/60;
   int hour = (int) totalHour;
   hour = (hour +gmt)%24;
   String isPM = "AM";
        System.out.println("The current time is: "+ hour + ":" + min + ":" + sec );
        System.out.println(hour);
   if (hour > 12) {
       isPM = "PM";
       hour = hour - 12;
   }
        //print result
	System.out.println("The current time is: "+ hour + ":" + min + ":" + sec + " " + isPM );
	}
}