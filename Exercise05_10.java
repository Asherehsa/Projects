/**
 * Created by Asher on 3/16/14.
 * Display numbers 100 to 1000, ten per line, that are divisible by 5 and 6
 */
public class Exercise05_10 {
    /**MainMethod**/
    public static void main (String[] args) {
        int count = 0;
        for (int i = 100; i <= 1000; i++){
        if (i % 5 == 0 && i % 6 == 0) {
            System.out.print(i + " ");
            count++;
            //make a new line every 10 numbers
                    if (count % 10 == 0)
                    System.out.print("/n");
        }
        }
}}
