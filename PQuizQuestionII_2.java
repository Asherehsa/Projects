/**
 * Created by Asher on 4/11/14.
 */
public class PQuizQuestionII_2 {
    //main
    public static void main (String[] args){
        double top = 101; //starts at 101 because the loop starts by decrimenting top.
        double bottom = 0;
        double sum = 0;
        for(int i=0; i<100; i++) {
            top--;
            bottom++;
            sum = sum + top/bottom; //top divided by bottom added to the sum
        }
        System.out.printf("%.3f", sum);
    }
}