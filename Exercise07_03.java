/**
 * Count occurence of numbers (1-100), expected to end in 0
 * Created by Asher on 4/12/14.
 */
import java.util.Scanner;
public class Exercise07_03 {
/* init the array and call input Array */
    public static void main(String args[]){

        int [] numbers = new int[100];
        inputArray(numbers);
}
/*  */
    public static void inputArray(int[] myList){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers from 1-100 (separated by spaces): ");
        int number = 0;
		  //take input
        for(int i = 1; i < myList.length; i++){
            if(i > 0){
					//index becomes the number you input
                number = input.nextInt();
					 if (number <= 100&& number >= 0){
                myList[index]++;
                System.out.println(number + " List: " + myList[index]);
					 }
					 else
					 System.exit("Done!")
            }
        }
    }
}

/* read numbers
int number = input.nextInt();
while (number !=0){

counts[number - 1] ++;
number = input.nextInt();
}

//Display result
for (int i = 0; i<100;i++) {
if (counts [i] > 0)
System.out.println((i+1)+ "occurs " + counts[i] + ((counts[i] ==1) ? " time" : "times" ));

*/

/*Expected output
Enter integers from 1-100 (seperated by spaces): 2 5 6 5 4 3 23 43 2 0
2 occurs 2 times
3 occurs 1 time
4 occurs 1 time
5 occurs 2 times
6 occurs 1 time
23 occurs 1 time
43 occurs 1 time
*/
