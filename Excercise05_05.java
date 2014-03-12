public class Excercise05_05 {
public static void main(String[] args){

final double CONVERSION = 2.2;

System.out.printf("%10s%10s     |  %10s%10s\n", "kilograms", "pounds", "pounds", "kilograms");

//do this with an for loop
int kilograms = 1;
int pounds = 20;
int count = 1;
while (count <= 100) {
	System.out.printf("%10d%10.3f     |  %10d%10.3f\n", kilograms,kilograms*2.2, pounds,pounds/2.2);
	kilograms +=2;
	pounds += 5;
	count++;
	}
	}}
   
   for (int count = 1; count <=100; kilograms += 2, pounts +=5, count++)