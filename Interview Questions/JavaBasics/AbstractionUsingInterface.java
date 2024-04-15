package JavaBasics;


    public class AbstractionUsingInterface {
        public static void main(String[] args) {
            // Create instances of Circle and Rectangle
            Shape circle = new Circle(5.0);
            Rectangle rectangle = new Rectangle(4.0, 6.0);
    
            // Calculate and display the areas
            System.out.println("Area of Circle: " + circle.calculateArea());
            System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        }
    }
     

