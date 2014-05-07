public class Truck extends Vehicle{
  
  //Omstamce Data Fields
  private int bedLength = 8;
  private engine = 450;
  
  //Class Data Fields
  private static int numberOfTrucks = 0;
  
  //Constructors
  public Truck(){
    super(); //Create default truck
    numberOfTrucks++; //count
  }
  
  