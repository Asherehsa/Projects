public class TestTrucks{
  public static void main(String [ ] args){
  
     //Create one instance of a vehicle
	  Vehicle v1 = new Vehicle();
	  
	  //Create one instance of a sportscar without arguments
	  Sportscar s1 = new Sportscar();
	  
	  //Create one instance of a truck without arguments
	  Truck t1 = new Truck();
	  
	  //Create another instance of a sportscar using arguments
	  Sportscar s2 = new Sportscar(true,195,"pink",4,"automatic",21);

	  
	  //Print results of sportscars
	  s1.totals();
	  t1.totals();
	  
  }
  
}
  
  
  
  
  
  
  
