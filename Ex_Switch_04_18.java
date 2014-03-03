import java.util.Scanner;

public class Ex_Switch_04_18 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = input.nextLine();

        switch(s.charAt(0))
        {
            case 'm':
            case 'M': System.out.print("Mathematics"); break;
            case 'c':
            case 'C': System.out.print("Computer Science"); break;
            case 'I': System.out.print("Information Technology"); break;
        }
    }}