/**
 * Created by Asher on 4/23/14.
 * Sum elements column by column
 */
import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String [] args){
      int height = 3;
      int row = 4;
      System.out.println("Enter a 3 by 4 matrix of doubles row by row: ");
      double[][] m;
      m = new double[3][4];
      m = arrayInput(m);
      System.out.println("Sum of the elements at column 0 is " + sumColumn(m,0));
      System.out.println("Sum of the elements at column 1 is " + sumColumn(m,1));
      System.out.println("Sum of the elements at column 2 is " + sumColumn(m,2));
    }
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;
        for (int row = 0; row < m.length; row++) {
            sum += m[row][columnIndex];
        }
        return sum;
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
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();

        }}
}
/*Enter a 3 by 4 matrix of doubles row by row:
 * 1.5 2 3 4
 * 5.5 6 7 8
 * 9.5 1 3 1
 * Sum of the elements at column 0 is 16.5
 */