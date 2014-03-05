import java.util.Scanner;

//4.18 - 3/4
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Student major & status */

public class Exercise04_18 {
/**MainMethod**/
public static void main (String[] args) {
    //Declare Variables
    String inputs, digit, character;
    char letter = 'Z', num ='9';
    //Create Scanner
    Scanner input = new Scanner(System.in);

    //Read in values
    System.out.print("Please enter a class letter (M C or I) and a class year (1, 2, 3 or 4): ");
    inputs = input.nextLine();
    if (Character.isLetter(inputs.charAt(0))){
        letter =  inputs.charAt(0);
    }
    if (Character.isDigit(inputs.charAt(1))){
        num =  inputs.charAt(1);
    }
    else {
        System.out.println("Invalid input");
        System.exit(1);
    }
switch (letter) {
    case 'M':
        System.out.print("Mathematics ");
        break;
    case 'C':
        System.out.print("Computer Science ");
        break;
    case 'I':
        System.out.print("Information Technology ");
        break;
    default:
        System.out.print("Invalid input: Please enter a valid class letter (M C or I)");
        System.exit(2);
}
    switch (num) {
        case '1':
            System.out.print("Freshman");
            break;
        case '2':
            System.out.print("Sophomore");
            break;
        case '3':
            System.out.print("Junior");
            break;
        case '4':
            System.out.print("Senior");
            break;
        default:
            System.out.print("Invalid input: Please enter a valid class year (1, 2, 3 or 4)");
            System.exit(2);
    }

}}
