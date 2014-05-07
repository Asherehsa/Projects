//Asher Silberman
public class PCOMP110_7_8_3b {
	//Main Method
	public static void main(String [] args){
		double[][] myArray = {{3.8,10.2,5.4},
									 {1.4,14.6,6.4},
									 {1.,3.,5.3}};
		double sum = sumMajorDiagonal(myArray);
		System.out.println("The sum of the elements in the major diagonal is: " + sum);
	}
	//Method for adding the numbers in diagonal of array
	public static double sumMajorDiagonal(double[][] m) {
	double sum = 0;
	int i = 0;
	while(i < m.length){
		sum += m[i][i];
		i++;
	}
	return sum;
	}
}