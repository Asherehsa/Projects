public class Ch9 {
    //Main Method
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + " and volume level is " + tv2.volumeLevel);
    }

    class Circle {
        double radius = 1.0; //Data field

        //construct a circle object
        Circle() {}

        //construct a circle object
        //constructer method must have the same name as the class
        Circle(double newRadius) {
            radius = newRadius;
        }

        //return the area of this circle
        double getArea() {
            return radius * radius * Math.PI; //Method
        }

        //return perimeter of this circle
        double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        //set new radius for this circle
        double setRadius(double newRadius) {
            radius = newRadius;
            return radius;
        }

    }
}
    public class TV {
        int channel = 1; // Default channel is 1
        int volumeLevel = 1; // Default volume level is 1
        boolean on = false; // By default TV is off

        public TV() {}

        public void turnOn() {
            on = true;
        }

        public void turnOff() {
            on = false;
        }

        public void setChannel(int newChannel) {
            if (on && newChannel >= 1 && newChannel <= 120)
                channel = newChannel;
        }

        public void setVolume(int newVolumeLevel) {
            if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7)
                volumeLevel = newVolumeLevel;
        }

        public void channelUp() {
            if (on && channel < 120)
                channel++;
        }

        public void channelDown() {
            if (on && channel > 1)
                channel--;
        }

        public void volumeUp() {
            if (on && volumeLevel < 7)
                volumeLevel++;
        }

        public void volumeDown() {
            if (on && volumeLevel > 1)
                volumeLevel--;
        }
    }
    
    public class Bicycle{
     private int id;
     private static in numberOfBicycles = 0;
     
     //constructor
     public Bicycle(int startCadence, int startSpeed, int startGear){
     gear = startGear;
     cadence = startCadence;
     speed = startSpeed;
     
     id = ++numberOfBicycles;
     }
     
     public int getID(){
       return id;
     }
     public static int getNUmberOf;
    }
    
public class MountainBike extends Bicycle{
  private int seatHeight;
  
  public MountainBike(int startHeight, int startCadence, int start){
                      //first create a bike
                      super(startCadence, startSpeed, startGear);
                      //then set mountainbike seat height
                      seatHeight = startHeight;
  }
  public void setHeight(int newValue){ //setter
    seatHeight = newValue;
  }
  public int getHeight(){ //getter
    return seatHeight;
  }
}