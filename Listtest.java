import java.util.*;

public class Listtest
{
    public static void main(String[] args)
    {
        // Create two collections:
        LinkedList lList =  new LinkedList();
        ArrayList aList =  new ArrayList();

        // Add some elements to lList:
        lList.add(Math.random()*10);
        lList.add(Math.random()*10);
        lList.add(Math.random()*10);
        lList.add(Math.random()*10);

        // Add some elements to aList:
        aList.add(7);
        aList.add(9);
        aList.add(2);

        // Display the two collections before:
        System.out.println("The aList collection before: " + aList);
        System.out.println("The lList collection before: " + lList);

        // Delete the elements lList that are not in aList:
        lList.retainAll(aList);

        // Display the collection after:
        // Display the two collections before retaining all:
        System.out.println("The aList collection after: " + aList);
        System.out.println("The lList collection after: " + lList);
    }
}