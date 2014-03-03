//3.26 - 3/2
// Asher Silberman
// COMP 110/L 1100-1345
/* The program I am submitting is my own work.   I may have had some help learning how to do  it, but ultimately, I wrote and tested this entire exercise myself. */
/* Two rectangle overlap */

import java.util.*;
import java.util.Arrays;
public class Exercise03_28  {
    public static void main(String [] args)
    {

        //get user input
        System.out.println("Enter the first rectangle's center x & y coordinates, width and height: ");
        Scanner input = new Scanner(System.in);
        double r1cx = input.nextDouble();
        double r1cy = input.nextDouble();
        double r1width = input.nextDouble();
        double r1height = input.nextDouble();
        System.out.println("Enter the second rectangle's center x & y coordinates, width and height: ");
        double r2cx = input.nextDouble();
        double r2cy = input.nextDouble();
        double r2width = input.nextDouble();
        double r2height = input.nextDouble();
        //find the points
        double r1x1 = r1cx - (r1width / 2.0);
        double r1x2 = r1cx + (r1width / 2.0);
        double r1y1 = r1cy + (r1height / 2.0);
        double r1y2 = r1cy - (r1height / 2.0);
        double r2x1 = r2cx - (r2width / 2.0);
        double r2x2 = r2cx + (r2width / 2.0);
        double r2y1 = r2cy + (r2height / 2.0);
        double r2y2 = r2cy - (r2height / 2.0);
        //isInside?
        Boolean isInside = ((r1x1 >= r2x1) && (r1x2 <= r2x2) && (r1y1 >= r2y1) && (r1y2 <= r2y2));
        //isOverlap?
        boolean isOverlap = ((r1x1 < r2x2) && (r1x2 > r2x1) &&  (r1y1 < r2y2) && (r1y2 > r2y1));
        //print results
if (isInside)
        System.out.println("The second rectangle is inside the first!");
else if (isOverlap)
        System.out.println("The rectangles overlap!");
else
        System.out.println("No overlap");
    }
}