public class Bicycle{


   //Instance Data Fields
   private int cadence = 1;
   private int gear = 2;
   private int speed = 5;
   
   private int id;
   
   //Class Data Field
	private static int numberOfBicycles = 0;
   
   //Constructor with no arguments
	public Bicycle(){		//No arguments
	id = ++numberOfBicycles;
	}
	
   //Constructor with arguments
   public Bicycle(int startCadence,int startSpeed,int startGear){
      gear = startGear;
      cadence = startCadence;
      speed = startSpeed;
      
      id = ++numberOfBicycles;
   }
   
   //Instance methods
	public int getId() {
      return id;
   }
   
   public static int getNumberOfBicycles(){
      return numberOfBicycles;
   }
   
   public int getCadence(){
      return cadence;
   }
   
   public void setCadence(int newValue){
      cadence = newValue;
   }
   
   public int getGear(){
      return gear;
   }
   
   public void setGear(int newValue){
      gear = newValue;
   }
   
   public int getSpeed(){
      return speed;
   }
   
   public void setSpeed(int newValue){
      speed = newValue;
   }
   
   public void applyBrake(int decrement){
      speed -= decrement;
   }
   
   public void speedUp(int increment){
      speed += increment;
   }
}
      
      

   
   