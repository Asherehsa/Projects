import java.util.Scanner;

/**
 * Created by Asher on 3/24/14.
 */
public class Hex2Dec {
    //Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        System.out.println("The greatest common devisor for " + ni + " and " + n2 "" )
    }
    public static int gcd(int n1, int n2) {
        int gdc = 1;

    }
    public static int hexToDecimal(String hex){
    int decimalValue = 0;
    for (int i =0; i<hex.legth();i++){
        char hexChar = hex.charAt(i);
        decimalValue = decimalValue + 16 + hexCharToDecimal(hexChar);
    }
        return decimalValue;
    }
}

