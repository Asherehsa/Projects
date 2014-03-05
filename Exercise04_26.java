import java.util.Scanner;

public class Exercise04_26 {
    public static void main(String[]args) {
// Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in double, for example 11.56: "
        );
        double amount = input.nextDouble();

        int remainingAmount = (int)(amount * 100);

        int decimalPosition = amountString.indexOf('.');

                if (decimalPosition == -1){ //page 136
                amount = Integer.parseInt(amountString);
                }
                else {
                String fractionPart = amountString.substring(decimalPosition+1);
                if (fractionPart.length()>=2){
                fractionPart=fractionPart.substring(0,2);
                }
                else if (fractionPart.length()==1);
                fractionPart
                }

        //Find the number of dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        //Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        //Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount/10;
        //Find the number of nickles in the remaining amount
        int numberOfNickles = remainingAmount/5;
        remainingAmount = remainingAmount % 5;

        //Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        //Display results
        System.out.println("You amount " + amount + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickles + " nickles");
        System.out.println("    " + numberOfPennies + " pennies");
        amount = Integer.parseInt(amountString.substring(0,decimalPosition)+fractionPart);
    }}