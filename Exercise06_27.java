import java.util.Scanner;

/**
 * Nonprime number who's reversal is also a prime
 */
public class Exercise06_27 {
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

   public static int reverse(int num) {
       int result = 0;
       int rem;
       while (num > 0) {
           rem = num % 10;
           num = num / 10;
           result = result * 10 + rem;
       }
       return result;
    }
    public static void main(String[] args){
        int count = 1;
        for(int i=1; count <= 100; i++){
        if (isPrime(i)==true&&isPrime(reverse(i))==true){
            System.out.print(i + " " );
            count ++;
            if (count%10==0){
            System.out.print("\n");
            }
        }
        }
    }
}
