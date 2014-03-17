/**
 * Created by Asher on 3/16/14.
 * find the smallest integer n such that n^2 is greater than 12,000
 */
public class Exercise05_12 {
    /**MainMethod**/
    public static void main (String[] args) {
        int i = 0;
        while(Math.pow(i,2) < 12000 ){
            i++;
        }
        System.out.print(i);
    }
}
