/**
 * Created by Asher on 4/28/14.
 * method that sums all the numbers in the major diagonal
 */
import java.util.Scanner;

public class Exercise08_02{
    public static void main(String [] args){
      int height = 3;
      int row = 4;
      System.out.println("Enter a 3 by 4 matrix of doubles row by row: ");
      double[][] m;
      m = new double[height][row];
      m = arrayInput(m);
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