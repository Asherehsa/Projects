/**
 * Created by Asher on 4/25/14.
 * Write a method to add to matricies
 */
import java.util.Scanner;

public class Exercise08_05 {

    public static void main(String [] args){
        int height = 3;
        int row = 3;
        System.out.println("Enter a 3 by 3 matrix of doubles row by row: ");
        double[][] m1;
        m1 = new double[height][row];
        m1 = arrayInput(m1);
        System.out.println("Enter a second 3 by 3 matrix of doubles: ");
        double[][] m2;
        m2 = new double[height][row];
        m2 = arrayInput(m2);
        print(m1);
        System.out.println(" + ");
        print(m2);
        System.out.println("=");
        print(addMatrix(m1,m2));
    }
    public static double[][] arrayInput(double[][] matrix){
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++){
                matrix[row][column] = input.nextDouble();
            }
        }
        return matrix;
    }
    public static void print(double[][] matrix){
        for (int row = 0; row < matrix.length; row++){
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println();


        }}
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] c;
        c = new double[3][3];
        for (int row = 0; row < a.length; row++){
            for (int column = 0; column < a[row].length; column++) {
                c[row][column] = a[row][column] + b[row][column];
            }
        }
        return c;
    }
}
/* It works!
Enter a 3 by 3 matrix of doubles row by row:
1 2 3 4 5 6 7 8 9
Enter a second 3 by 3 matrix of doubles:
0 2 4 1 4.5 2.2 1.1 4.3 5.2
1.0 2.0 3.0
4.0 5.0 6.0
7.0 8.0 9.0
 +
0.0 2.0 4.0
1.0 4.5 2.2
1.1 4.3 5.2
=
1.0 4.0 7.0
5.0 9.5 8.2
8.1 12.3 14.2
 */