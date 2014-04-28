public class Rectangle{
  //Data Fields
  private double length = 1;
  private double width = 1;
  private String color = "White";
  
  private static int numberOfRectangles = 0;
  
  //Constructors
  public Rectangle(){
    numberOfRectangles++;
  }
  public Rectangle(double newLength, double newWidth, String newColor){
    length = newLength;
    width = newWidth;
    color = newColor;
    numberOfRectangles++;
  }
}