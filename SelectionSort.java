/**
 * Created by Asher on 4/20/14.
 * The selectionSort(double[] list) method sorts any array of double elements.
 */
public class SelectionSort {
    //Sort le numbers
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
    public static void main(String args[]){
        double[] list = {2.5,1,5,4};
        SelectionSort.selectionSort(list);
       for (int p = 1; p < list.length; p++){
            System.out.println("Le person's grade is: " + list[p]);
            }
    }
}