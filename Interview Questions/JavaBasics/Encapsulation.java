package JavaBasics;

public class Encapsulation {
    private String Name;
    private int age;

    // Constructor
    Encapsulation(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return Name;
    }

    // Setter for name
    public void setName(String Name) {
        if (Name != null && !Name.isEmpty()) {
            this.Name = Name;
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public static void main(String args[]) {
        Encapsulation person1 = new Encapsulation("Aditya", 21);
        Encapsulation person2 = new Encapsulation("Mohan",42 );

        System.out.println(person1.getName() + "   " + person1.getAge());
        System.out.println(person2.getName() + "   " + person2.getAge());
    }
}
