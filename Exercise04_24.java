import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Asher on 3/4/14.
 */
public class Exercise04_24 {
    /**MainMethod**/
    public static void main (String[] args) {
        //Create Scanner
        Scanner input = new Scanner(System.in);
        //Read in values
        System.out.print("Enter the 1\uFB06 city: ");
        String first = input.nextLine();
        System.out.print("Enter the 2nd city: ");
        String second = input.nextLine();
        System.out.print("Enter the 3rd city: ");
        String third = input.nextLine();
        ArrayList<String> list = new ArrayList<String>();
        list.add(first);
        list.add(second);
        list.add(third);
        java.util.Collections.sort(list);
        System.out.println(list);
    }}