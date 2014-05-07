public class ArrayOfPipes{
  public static void main(String [] args){
    OnePipe [] name = new OnePipe[3];
      for(int i = 0; i < name.length; i++)
        name[i] = new OnePipe(i*4.0);
    for(int i = 0; i < name.length; i++)
      System.out.println(name[i].getL());
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
