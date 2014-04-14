/**
 * Created by Asher on 4/13/14.
 */
public class ArrayShuffle {
for (int i = myList.length - 1; i>0; i--){
        int j = (int) (Math.random() * (i+1));

        //Swap myList[i] with myList[j]
        double temp = myList[i];
        myList[i] = myList[j];
        myList[j] = temp;
    }
}
