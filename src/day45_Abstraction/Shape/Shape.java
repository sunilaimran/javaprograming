package day45_Abstraction.Shape;

public  abstract class Shape {

    private final String name;

    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public abstract double area();

    public abstract double preimeter();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area='" + area() + '\'' +
                ", perimeter='" + preimeter() + '\'' +
                '}';
    }
}
