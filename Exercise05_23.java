/**
 * Created by Asher on 3/17/14.
 * Cancellation Errors
 */
public class Exercise05_23 {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i <= 50000; i++) {
            sum = 1. / i + sum;
        }
        System.out.println(sum);
        sum = 0;
        for (int i = 50000; i >= 1; i--) {
            sum = 1. / i + sum;
        }
        System.out.println(sum);
    }
}
