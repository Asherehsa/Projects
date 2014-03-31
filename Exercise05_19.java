/*
 * Created by Asher on 3/17/14.
 * Numbers in a Pyramid
 */

public class Exercise05_19 {
    public static void main(String[] args) {
        int num = 0;

        for (int row = 0; row <=7; row++){
            for (int col = 1; col <= 7 - row; col++)
                System.out.printf("%4s", " ");
// left row
            for (int col = 0; col <= row; col++) {
                num = (int)Math.pow(2, col);
                System.out.printf("%4d", num);
            }
// right row
            for (int col = row - 1; col >= 0; col--) {
                num = (int)Math.pow(2, col);
                System.out.printf("%4d", num);
            }
            System.out.print('\n');
        }
    }
}