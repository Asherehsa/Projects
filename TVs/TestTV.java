public class TestTV {  
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
    
    //Since channel is still public, I can set it directly to illegal values
    tv1.channel = 600;
    
    //Using the method checks for limits
    tv1.setChannel(300);
    
    System.out.println("Number of TVs Created: " + TV.getNumberOfTVs());
    
    System.out.println("tv1's channel is " + tv1.channel 
      + " and volume level is " + tv1.getVolume() );
    System.out.println("tv2's channel is " + tv2.channel 
      + " and volume level is " + tv2.getVolume() );
  }
}
