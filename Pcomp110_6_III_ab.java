/* Asher Silberman
Comp110
11am */

public class Pcomp110_6_III_ab {
	public static void main(String []args) {
	/* Loops 5 times to print the table's values. */
	//System.out.printf("%10s%10s\n", "i", "m(i)");
		System.out.println("i \t m(i)");
		int i = 1;
		do{
			System.out.printf("%d %10.4f \n", i, m(i));
			i++;
			}while(i<=5);
	}
	
	public static double m( int i ){
	double sum = 0;
	for (double x = 1; x <= i; x++) {
		sum += (x/(2 * x + 1));
	}
	//actual computation~
	return sum;
	}
}