public class MountainBike extends Bicycle{
   
   //variable
   private int seatHeight=3;    //Default value
   
   //Constructor with no arguments
	public MountainBike(){
	}
	
	//Constructor with Arguments
   public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear){
      
      //First, create a bicycle
      super(startCadence, startSpeed, startGear);
      
      //Then set mountainbike seat height for this instance
      seatHeight = startHeight;
   }   
   
   //Instance methods
   public void setHeight(int newValue){
      seatHeight = newValue;
   }
   
   public int getHeight(){
      return seatHeight;
   }
      public void moreHeight(){
      seatHeight++;
   }
      public void lessHeight(){
      seatHeight--;
   }
   
}