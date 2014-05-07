public class TestPipes{ //the public class is the name of the file
  public static void main(String [] args){
    //Create an array of objects
    
    OnePipe p1 = new OnePipe();
    OnePipe p2 = new OnePipe(5.);
    
    System.out.println(p1.getL()); //objects always need parens
    System.out.println(p2.getL());
    
    System.out.println(p1.getCount());
    
    TwoPipes p3 = new TwoPipes();
    
    TwoPipes p4 = new TwoPipes(16.,20.);
    System.out.println(p4.getCount());
    System.out.println(p4.getL());    
  }
}

class OnePipe{ //you can have other classes
  
  //class variable
  static int count = 0; //Instances have access to all static variables
  
  //instance variable
  private double  l = 1.; 
  
  //No argument constructor
  OnePipe(){
    count++;
  }
  
  //Constructor with an argument
  OnePipe(double setL){
    l = setL;
    count++;
  }
  
  //Getter
  double getL(){
    return l;
  }
  
  int getCount(){
    return count;
  }
  
  //Setter
  void setL(double newL){
    
  }
}

class TwoPipes extends OnePipe{
//instance var
  private double 12 = 3.;
  
  TwoPipes();{
    super();
  }
  //Constructor with 2 args
  TwoPipe(double newL1, double newL2){
    super (newL1);
    l2 = newL2;
  }
  double getL(){
    return super.getL() + l2;
  }
}