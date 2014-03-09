/*
 * This is a new project
 * 4 March 2014
 * 
 * Version .9
 * Author @ MmeBunneh
 */
public class Zombies
{
    private static final int HUMAN = 0;
    private static final int BUNNEH = 1;
    private static final int ZOMBIE = 2;
    
    public static int [][] makeZombieArray()
    {
        int [][] temp = 
        {
            {0,0,0,0,0,1,0,1,0},
            {1,0,1,0,0,0,1,0,0},
            {0,0,0,1,0,1,1,0,0},
            {0,1,0,1,0,0,0,0,1}
        };
        return temp;
    }
    
    public static void printArray(int [][] a)
    {
        for (int row = 0; row < a.length; row++)
        {
            for (int col = 0; col < a[0].length; col++)
            {
                //int cell = a[row][col];
                if (a[row][col] == HUMAN)
                {
                    System.out.print("H");
                }
                else if (a[row][col] == BUNNEH)
                {
                    System.out.print("B");
                }
                else
                {
                    System.out.print("Z");
                }
                //System.out.print(a[row][col]);
            }
            System.out.println();
        }
    }
    
    public static void main (String [] args)
    {
        int [][] zombieArray = makeZombieArray();
        printArray(zombieArray);
        
        //zombieAttack(zombieArray, 2, 3);
        zombieAttack(zombieArray, 0, 0);
        //zombieAttack(zombieArray, 4, 2);
        //zombieAttack(zombieArray, -3, 25);
    }
    
    public static void zombieAttack(int [][] a, int row, int col)
    {
        System.out.print("row=" + row + " col=" + col);
        if (row < 0 || row >= a.length ||
            col < 0 || col >= a[row].length )
        {
            System.out.println(" off the grid");
            return;
        }
        
        if (a[row][col] != HUMAN)
        {
            System.out.println(" not a human");
            return;
        }
        
       System.out.println(" found a human");
       a[row][col] = ZOMBIE;
       printArray(a);
       zombieAttack(a, row, col+1);
       zombieAttack(a, row, col-1);
       zombieAttack(a, row+1, col);
       zombieAttack(a, row-1, col);
    }
   
}