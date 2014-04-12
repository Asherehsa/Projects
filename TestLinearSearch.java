/**
 * Created by Asher on 4/2/14.
 */
public class TestLinearSearch {
    public static void main(String[] args){
        int[] list = (1,4,4,2,5,-5);
        int 1 = LinearSearch.search(list,4);
        int 3 = LinearSearch.search(list,-4);
        int k = LinearSearch.search(list,-3);
    }
}
