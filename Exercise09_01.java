/**
 * Created by Asher on 4/28/14.
 * Rectangle class
 */

public class Exercise09_01 {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(4, 40);
        System.out.println("The area of a rectangle with width " +
                myRectangle.width + " and height " +
                myRectangle.height + " is " +
                myRectangle.getArea());
        System.out.println("The perimeter of a rectangle is " +
                myRectangle.getPerimeter());

        Rectangle yourRectangle = new Rectangle(3.5, 35.9);
        System.out.println("The area of a rectangle with width " +
                yourRectangle.width + " and height " +
                yourRectangle.height + " is " +
                yourRectangle.getArea());
        System.out.println("The perimeter of a rectangle is " +
                yourRectangle.getPerimeter());
    }
}

class Rectangle {
    double height = 1.0; //Data field
    double width = 1.0;

    //construct a rectangle object
    Rectangle() {}

    //construct a rectangle object
    //constructer method must have the same name as the class
    Rectangle(double newl, double neww) {
        height = newl;
        width = neww;
    }

    //return the area of this rectangle
    double getArea() {
        return height * width; //Method
    }

    //return perimeter of this rectangle
    double getPerimeter() {
        return 2 * height + 2 * width;
    }

}