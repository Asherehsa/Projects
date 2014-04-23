/**
 * Created by Asher on 4/22/14.
 * Write a method that merges two sorted lists into a new storted list!
 */

import java.util.Scanner;
import java.util.Arrays;
public class Exercise07_31 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
    //Read in values
    System.out.print("Enter list 1: ");
    int l1 = input.nextInt();
    int[] list1 = new int[l1];
    int i = 0;
    while (i < list1.length){
        list1[i] = input.nextInt();
        i++;
    }
        i=0;
    System.out.print("Enter list 2: ");
    int l2 = input.nextInt();
    int[] list2 = new int[l2];
    while (i < list2.length){
        list2[i] = input.nextInt();
        i++;
    }
        i=0;
    int[] list3 = merge(list1,list2);
    while (i<list3.length ){
    System.out.print(list3[i] + " ");
    i++;
    }
    }
    public static int[] merge(int[] list1, int[] list2){
    int l3 = list1.length +  list2.length;
    int[] list3 = new int [l3];
        int i = 0;
    while (i < list1.length){
            list3[i] = list1[i];
            i++;
        }
        int j = 0;
    while (j < list2.length){
            list3[j+list1.length] = list2[j];
            j++;
        }
        Arrays.sort(list3);
    return list3;
    }

}
/* Enter list1: 5 1 5 16 61 111
Enter list2: 4 2 4 5 6
The merged list is 1 2 4 5 5 6 16 61 111
 */