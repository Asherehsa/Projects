Notes~
##current time!
System.out.println(System.currentTimeMillis());
##printf
system.out.println("\nThe first value is %3.2f and the second is %15_3f", val1,val2)

#Conditionals
int a=30, b=40,c=20
int d = (b>c) ?((a>b>?c:a):((b>a)?a:b)
boolean ? expression : expression
if boolean true do expression 1

if (b>c)
	if (a>b)
	d=c;
		else
		d=a
else
	if(b>a)
	d=a;
	else
	d=b;

import java.util.*;
public class LotteryInLab()
{
	public static void main(String [] args)
	{
	//Randomly generate lottery number
	int lottery = (int) (Math.random());
	
	//Display lottery number
	System.out.println("The Lotto # is" + lottery);
	//Parse lottery number into individual digits
	ArrayList ln = new ArrayList(); 
	al.add(lottery/100);
	al.add((lottery%100)/10);
	al.add((lottery%10);
	List list = new ArrayList();
	//Ask user to enter a guess
		System.out.println("Please enter three digits");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
	//Parse the guess into its digits
	int g1 = guess/100;
	int g2 = (guess%100)/10;
	int g3 = guess%10;
	//Did user win $10,000
	if guess == lottery {
	System.out.println("You won 10k!")
	
	//Did user win $3,000
	
	//Did user win $1,000
	
	//Let the user know they didn't win anything
	}

}