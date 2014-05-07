public class Sportscar extends Vehicle{

   //Instance Data Fields
	private boolean convertible = true;
	private int engine = 300;
	
	//Class Data Fields
	private static int numberOfSports = 0;
	
	//Constructors
	public Sportscar(){
	  super();					//Create default vehicle
	  numberOfSports++;
	}
	
	public Sportscar(boolean isConvertible,int enginePower,String newColor,int numberOfWheels,String typeOfTransmission,int newLength){
	  super(newColor,numberOfWheels,typeOfTransmission,newLength);
	  convertible = isConvertible;
	  engine = enginePower;
	  numberOfSports++;
	}
	
	public void totals(){
	  	System.out.println("\nTotal Vehicles: " + Vehicle.howMany());
	   System.out.println("Total Sportscars: " + numberOfSports);
	}
}
	