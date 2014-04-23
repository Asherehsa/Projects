/**
 * Created by Asher on 4/22/14.
 * Write a method to solve quadratic equations
 */

import java.util.Scanner;

public class Exercise07_25 {
    public static void main(String [] args){
        //Read in values
        System.out.print("Enter a, b & c:");
        Scanner input = new Scanner(System.in);
        double[] eqn = new double [3];
        double[] roots = new double[4];
        eqn[0] = input.nextDouble();
        eqn[1] = input.nextDouble();
        eqn[2] = input.nextDouble();
        solveQuadratic(eqn,roots);
    }
    public static int solveQuadratic(double[] eqn, double[] roots){

        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[3];



        */
        //Declare Variables
        double dis, nroot, proot;
        //calculate the discriminant
        dis = (Math.pow(eqn[1],2)-4*eqn[0]*eqn[2]);
        //find the roots
        if (dis > 0){
            proot = (-eqn[1] + Math.pow(dis,.5))/(2.*eqn[0]);
            nroot = (-eqn[1] - Math.pow(dis,.5))/(2.*eqn[0]);
            System.out.print("The equation has two roots " + proot + " & " + nroot);
            return 2;
        }
        else if (dis == 0.){
            proot = -eqn[1]/(2.*eqn[0]);
            System.out.print("The equation has one root " + proot);
            return 1;
        }
        else{
            System.out.print("The equation has no real roots");
            return 0;
        }
    }
}
