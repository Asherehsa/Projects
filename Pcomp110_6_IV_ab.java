/* Asher Silberman
Comp110
11am */

import java.util.Scanner;

public class Pcomp110_6_IV_ab {
	public static void main(String []args) {
		System.out.print("Enter an integer value please: ");
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		displayNumber(n);
	}
	public static void displayNumber(int n) {
	int i = 1;
		while (i<=n){
		System.out.print(i + "  ");
		if (i%7 == 0)
		System.out.println();
		i++;
		}
	}
}