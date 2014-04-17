/**
 * Count occurence of numbers
 * Created by Asher on 4/12/14.
 */
import java.util.Scanner;
public class Exercise07_03 {
    public static void main(String args[]){

        int[] numbers = new int[100];
        inputArray(numbers);
}
    public static void inputArray(int[] myList){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers from 1-100: ");
        int index = 0;
        for(int i = 1; i < myList.length - 1; i++){
            if(i > 0){
                index = input.nextInt();
                myList[index]++;
            }

            if(index>0){
                if(myList[index-1] > 1)
                    System.out.println(index + " occurs " + myList[index] + " times ");
            }
            else
                System.out.println(index + " occurs " + myList[index] + " time ");
        }
        }

        }

/*read numbers
int number = input.nextInt();
while (number !=0){
if (number <= 100&& number >= 0)
counts[number - 1] ++;
number = input.nextInt();
}

//Display result
for (int i = 0; i<100;i++) {
if (counts [i] > 0)
System.out.println((i+1)+ "occurs " + counts[i] + ((counts[i] ==1) ? " time" : "times" ));

