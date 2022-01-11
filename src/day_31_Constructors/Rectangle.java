package day_31_Constructors;

public class Rectangle {

  public double length, width;

  public Rectangle(double lenght, double width){

    this.length = lenght;
    this.width = width;
  }
     public double calaArea(){
       return length*width;
     }
    public double calcPerimeter(){
    return 2 * (length + width);
    }

  public String toString() {
    return "Rectangle{" +
            "length=" + length +
            ", width=" + width +
            ", area=" + calaArea() +
            ", preimeter=" + calcPerimeter() +
            '}';
  }
}
  /*  create a custom class named Rectangle
        Attributes:
        length, width

        Add a constructor that can set all the fields

        Actions:
        calculateArea(): calculates the area of the rectangle, returns it as double
        calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
        toString(): displays the width, length, area and perimeter of the rectangle when an object of rectangle
         passed in the print statement
   */
