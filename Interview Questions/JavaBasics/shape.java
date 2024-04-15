package JavaBasics;

    abstract class Shape {
    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();
}//do not contain any method body and are meant to be overridden

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

   @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

