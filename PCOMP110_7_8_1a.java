public class PCOMP110_7_8_1a {
  public static void main(String[] args) {
    int[] list = {1, 2, 3, 5, 4};
    
    for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
      // Swap list[i] with list[j]
      int temp = list[i];
      list[i] = list[j];
      list[j] = temp;
    }
    System.out.print(java.util.Arrays.toString(list));
  }
}