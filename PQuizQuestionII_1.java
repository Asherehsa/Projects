/**
 * Created by Asher on 4/11/14.
 */
import java.util.Scanner;
public class PQuizQuestionII_1{
    public static void main (String[] args){
        int in = 0;
        Scanner input = new Scanner(System.in);
        do {
            in = input.nextInt(); //Take input after every time the loop loops
            System.out.print(in%2==0 ? "MultipleOfTwo " : "");
            System.out.print(in%3==0&&in%5==0 ? "MultipleOfThreeAndFive ": "");
            System.out.print((in%7==0||in%9==0)&&(in%7!=in%9) ? "MultipleOfSevenOrNineButNotBoth ": "");
        }while(in != -1); //If input is -1 end the loop!
        System.out.print("Done");
    }
}