public class Vehicle{
  
  //Data Fields
  private String color = 'white';
  private int wheels = 4;
  private String manualTransmission = 'manual';
  private double length = 20;
  
  //Class Data field
  private static int numberOfVehicles = 0;
  
  //constructor with no args
  public Vehicle(){
    numberOfVehicles++;
  }
  
  //Constructor with arguments
  public Vehicle(String newColor, int numberOfWheels, String typeOfTransmission){
    color = newColor;
    wheels = numberOfWheels;
    manualTransmission = typeOfTransmission;
    length = newLength;
    numberOfVehicles++;
  }
  public static int howMany(){
    return numberOfVehicles;
  }
