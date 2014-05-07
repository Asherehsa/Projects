public class Truck extends Vehicle{

   //Instance Data Fields
	private int bedLength = 8;
	private int engine = 450;
	
	//Class Data Field
	private static int numberOfTrucks = 0;
	
	//Constructors
	public Truck(){
	  super();				       //Create default vehicle
	  numberOfTrucks++;        //Count Trucks
	}
	
	public Truck(int newBedLength,int enginePower,String newColor,int numberOfWheels,String typeOfTransmission,int newVehicleLength){
	  super(newColor,numberOfWheels,typeOfTransmission,newVehicleLength);
	  bedLength = newBedLength; //Set bed length
	  engine = enginePower;     //Set engine power
	  numberOfTrucks++;         //Count Trucks
	}
	
	//Methods
	public void totals(){
	  	System.out.println("\nTotal Vehicles: " + Vehicle.howMany());
	   System.out.println("Total Trucks: " + numberOfTrucks);
	}
	
}