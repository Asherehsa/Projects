/**
 * Created by Asher on 3/17/14.
 */
public class Excercise05_18 {
    /**MainMethod**/
    public static void main (String[] args) {
        //Pattern 1
        for (int i = 1; i <= 6; i++){
            for (int j = 1; j <= i; j++)
                System.out.print(j +" ");
            System.out.println();
        }
        //Pattern 2
        for (int i = 1; i<=6; i++){
            for (int j = 1; j<=7 - i; j++)
                System.out.print(j+" ");
        System.out.println();
        }
        //Pattern 3
        for(int i = 1; i<=6; i++){
            for(int j=6; j >= 1;j--)
                System.out.print(j<=i ? j + " " : "  ");
            System.out.println();

        }
    }

}
