/**
 * Created by Asher on 4/23/14.
 * Sum elements column by column
 */
import java.util.Scanner;

public class Exercise08_01 {
    public static void main(String [] args){
      int height = 3;
      int row = 4;
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a 3 by 4 matrix of doubles row by row: ")
      m = new int[3][4];
      arrayInput(m);
      
    }
    public static double sumColumn(double[][] m, int columnIndex){
      
    }
    public static double arrayInput(double[][] matrix){
      for (int row = 0; row < matrix.length; row++) {
        for (int column = 0; column < matrix[row].length; column++){
          matix[row][column] = input.nextInt();
        }
      }
    }
}
/*Enter a 3 by 4 matrix of doubles row by row:
 * 1.5 2 3 4
 * 5.5 6 7 8
 * 9.5 1 3 1
 * Sum of the elements at column 0 is 16.5
 * 