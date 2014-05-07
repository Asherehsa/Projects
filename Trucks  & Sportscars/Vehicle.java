public class Vehicle{
 
   //Instance Data Fields  
	private String color = "white";
	private int wheels = 4;
	private String manualTransmission = "manual";
	private double length = 20;
	
	//Class Data Field
	private static int numberOfVehicles = 0;
	
	
	//Constructor with no arguments
	public Vehicle(){			 
	  numberOfVehicles++;
	}
	
	//Constructor with arguments 
	public Vehicle(String newColor,int numberOfWheels,String typeOfTransmission,int newLength){
	  color = newColor;
	  wheels = numberOfWheels;
	  manualTransmission = typeOfTransmission;
	  length = newLength;
	  numberOfVehicles++;
	}
	
	//Two Class Methods
	public static int howMany(){
	  return numberOfVehicles;
	}
	
	public static void increaseVehicles(){
	  numberOfVehicles++;
	}
	
	
}
	











