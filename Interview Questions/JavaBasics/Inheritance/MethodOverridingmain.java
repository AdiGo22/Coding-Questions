package JavaBasics.Inheritance;

public class MethodOverridingmain {
    public static void main(String[] args) {
        MethodOverriding animal1 = new Dog(); // Create a Dog instance
        MethodOverriding animal2 = new Cat(); // Create a Cat instance

        animal1.makeSound(); // Calls Dog's overridden method
        animal2.makeSound(); // Calls Cat's overridden method
    }
}
