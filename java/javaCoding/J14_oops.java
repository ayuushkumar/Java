package javaCoding;

class Employee{
    int age;
    String name;
    double salary;
    public void display(){
        System.out.println("Employee age is: "+age);
        System.out.println("and name is: "+name);
    }
    public double getSalary(){
        return salary;
    }

}

public class J14_oops {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee ayush = new Employee(); // Instantiating a new Object
        Employee karan = new Employee();

        // Setting Attributes
        ayush.age = 21;
        ayush.name = "Ayush Kumar";
        ayush.salary = 120;

        karan.age = 20;
        karan.name = "Karan";
        karan.salary = 120;

        // Printing the Attributes
        // System.out.println(ayush.age);
        // System.out.println(ayush.name);

        ayush.display();
        karan.display();
        double salary = karan.getSalary();
        System.out.println(salary);

    }

}

// Class - A class is a blueprint for creating objects.
// Object - An Object is an instantiation of a class.
// Abstraction - Hiding internal details.
// Encapsulation - The act of putting various components together (in a capsule).
// Inheritance - The act of deriving new things from existing things.
// Polymorphism - One entity many forms.
