/**
 * Created by Asher on 4/21/14.
 */
import java.util.Scanner;
public class TestExercise {
    public static void main(String [] args){
        //Initial Setup
        Scanner input = new Scanner(System.in);
        int [] count = new int [100];
        int number;

        //Read first value
        System.out.print("Enter integers from 1-100 (separated by spaces): ");
        number = input.nextInt();

       while (number != 0){
           if(number >= 1 && number <= 100) count[number - 1]++;
           number = input.nextInt();
       }
        //Print out only non-zero results
        for (int i = 0; i< count.length; i++){
            if (count[i-1] !=0)
            System.out.printf("%4d occurred %4d times \n",i,count[i-1]);
        }
    }
}
