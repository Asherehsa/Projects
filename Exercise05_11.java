/**
 * Created by Asher on 3/16/14.
 * Display numbers 100 to 200, ten per line, that are divisable by 5 or 6 but not both.
 */
public class Exercise05_11 {
    /**MainMethod**/
    public static void main (String[] args) {
        int count = 0;
        for (int i = 100; i <= 200; i++){
            if (i % 5 == 0 && i % 6 == 0) {
            }
            else if (i % 5 == 0 || i % 6 == 0){
                System.out.print(i + " ");
                count++;
                //make a new line every 10 numbers
                if (count % 10 == 0)
                    System.out.println();
            }
        }
     }
}
