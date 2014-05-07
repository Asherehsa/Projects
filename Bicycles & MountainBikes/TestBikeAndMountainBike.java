public class TestBikeAndMountainBike{
   public static void main(String [] args){
   
   int cadence = 5;
   int gear = 3;
   int speed = 10;
   int height = 2;
   
   //Create just a bicycle
   Bicycle myBike1 = new Bicycle(cadence++,speed++,gear++);
   
   //Create a mountainbike
   MountainBike myBike2 = new MountainBike(height,cadence,speed,gear);
   
	//Create another mountainbike with no arguments
	MountainBike myBike3 = new MountainBike();
   
   //Use instance methods to get/set values
	System.out.println("\nMountainbike myBike1 speed: " + myBike1.getSpeed());
   myBike1.setSpeed(50); 
   System.out.println("Mountainbike myBike1 speed: " + myBike1.getSpeed());
   
   System.out.println("\nMountainbike myBike2 speed: " + myBike2.getSpeed());
   myBike2.setSpeed(60); 
   System.out.println("Mountainbike myBike2 speed: " + myBike2.getSpeed());

   System.out.println("\nMountainbike myBike2 seat height: " + myBike2.getHeight() );
   myBike2.setHeight(200); 
   System.out.println("Mountainbike myBike2 seat height: " + myBike2.getHeight() );

   System.out.println("\nMountainbike myBike3 seat height: " + myBike3.getHeight() );
   myBike3.setHeight(200); 
   System.out.println("Mountainbike myBike3 seat height: " + myBike3.getHeight() );
   }
}