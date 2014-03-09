//4.17 - 3/8
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Days of a month*/

import java.util.Scanner;
public class Exercise04_17 {
    public static void main (String[] args) {
    //Create Scanner
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a year: ");
    int year = input.nextInt();
    System.out.println("Enter first 3 letters of a month name: ");
    String month = input.next();


    if (month.equals("Jan")||month.equals("Mar")||month.equals("May")||month.equals("Jul")||month.equals("Oct")||month.equals("Dec"))
        System.out.println(month + " " + year + " has 31 days.");
    else if (month.equals("Apr")||month.equals("jun")||month.equals("sep")||month.equals("nov"))
        System.out.println(month + " " + year + " has 30 days.");
    else if (month.equals("Feb"))
        if ((year %4==0 && year * 100!=0)||(year%400==0))
    System.out.print("\n" + month + " " + year + " has 29 days because " + year + " is a leap year");
        else
    System.out.print("\n" + month + " " + year + " has 28 days");
    else
        System.out.println(month + " is not a correct month name");
}}