/**
 * Created by Asher on 4/11/14.
 */
import java.util.Scanner;
public class PQuestionII_3{
    //main
    public static void main (String[] args){
        String in;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a string: ");
        in = inp.nextLine();
        String inLow = in.toLowerCase();
        int low = 0;
        int count = in.length();
        char at;
        for (int i = 0; i<in.length(); i++){
            at = in.charAt(i);
            if (at.isLower)
                low++;
        }
        System.out.println("Total characters: " + count);
        System.out.println("Total lowercase characters: " + low);
    }
}