import java.util.Scanner;

/**
 * Created by Asher on 3/24/14.
 * Sum of digits  in an int
 */

public class Exercise06_02 {
    public static int sumDigits(long n){
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number ");
        System.out.println("That makes " + sumDigits(in.nextInt()));

    }
}
/*
int temp = (int)Math.abs(n);
int sum = 0;
while (temp !=0){
        int remainder = temp % 10;
        sum += remainder;

        }
        */