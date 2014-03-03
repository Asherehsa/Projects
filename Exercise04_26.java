import java.util.Scanner;

public class Exercise04_26 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        String amountString = input.nextLine();

        int decimalPosition = amountString.indexOf(',');

        int amount; //in cents

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
        fractionPart = fractionPart + "00";
    }
    amount = Integer.parseInt(amountString.substring(0,decimalPosition)+fractionPart);
    }
    }}