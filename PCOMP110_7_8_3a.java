//Asher Silberman
public class PCOMP110_7_8_3a {
 //Main
 public static void main(String [] args){
  double [] myArray = {3.8,10.2,1.4,14.6,7.3};
  int index = indexOfSmallestElement(myArray);
  System.out.println("The index of the smallest value is: " + index);
  }
  
 
 
 
  public static int indexOfSmallestElement(double [] list) {
    double min = list[0];
    int minIndex = 0;
    
    for (int i = 1; i < list.length; i++)
      if (min > list[i]) {
      min = list;
    }
    /*
   int temp = (list.length - 1);
   for(int i=list.length - 2; i < list.length; i--){
    list[temp] = (list[temp] > list[i]) ? temp:list[i];
   }
   return temp;
  }
  */
}
  
  //homework is 25%
  //each quiz is 10%
  //Final is 15%