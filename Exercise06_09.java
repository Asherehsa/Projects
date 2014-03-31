/**
 * Convert between feet and meters
 */
public class Exercise06_09 {


    public static double footToMeter(double foot){
        foot = foot * 0.305;
        return foot;
    }
    public  static double meterToFoot(double meter){
        meter = meter * 3.279;
        return meter;
    }
    public static void main(String[] args){
        double f = 1;
        double m = 20;
        System.out.print( "feet \t" + "meters" + "\t | \t meters \t" + "feet \n");
        do{
        System.out.printf( "%.2f   %5.3f    |        %5.2f         %5.3f %n", f, footToMeter(f), m, meterToFoot(m));
        f++;
        m = m + 5;
        }while(f <= 10 && m <= 65 );

    }
}
