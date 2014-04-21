/**
 * Sort students names and scores by score (decreasing)
 * Created by Asher on 4/19/14.
 */
public class Exercise07_17 {
    //Sort all the things! (and return them)
    public static double[] selectionSort(double[] list) {
        //Find the minimum in the list
        for(int i = 0; i < list.length - 1; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++){
                if (currentMin > list[j]); {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            //Swap list[i] with list[currentMinIndex]
            if (currentMinIndex !=i){
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
    //MAIN
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of items:");
        int n = input.nextInt();
        double [] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for(int i = 0;i<n;i++){
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }
        double average = sum/n;
        int count = 0; //The number of elements above average
        for (int i = 0; i<n;i++)
            if (numbers[i]>average)
                count++;
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);
    }
}