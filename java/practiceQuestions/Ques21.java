package practiceQuestions;

// =======================================================
//  Q.Create a class Circle and use inheritance to create
//  Another class Cylinder from it.
// =======================================================

class Circle{
    public int radius;
    Circle(){
        System.out.println("circle");
    }
    Circle(int r){
        System.out.println("I am circle constructor");
        this.radius = r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder1 constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

// ==========================================================
//  Q.Create a class Rectangle and use inheritance to create
//  another class Cuboid from it.
// ==========================================================

class Rectangle2 {
    public int length;
    public int breadth;

    Rectangle2() {
        System.out.println("rectangle");
    }

    Rectangle2(int l, int b) {
        System.out.println("I am rectangle constructor");
        this.length = l;
        this.breadth = b;
    }

    public double area() {
        return this.length * this.breadth;
    }
}

class Cuboid extends Rectangle2 {
    public int height;

    Cuboid(int l, int b, int h) {
        super(l, b);
        System.out.println("I am cuboid constructor");
        this.height = h;
    }

    public double volume() {
        return this.length * this.breadth * this.height;
    }
}

// =======================================================
//  Q. Create a class Employee and use inheritance to create
//      another class Manager from it.
// =======================================================

class Employee2 {
    public int salary;

    Employee2(int s) {
        System.out.println("I am employee constructor");
        this.salary = s;
    }

    public int getSalary() {
        return this.salary;
    }
}

class Manager extends Employee2 {
    public int bonus;

    Manager(int s, int b) {
        super(s);
        System.out.println("I am manager constructor");
        this.bonus = b;
    }

    public int totalSalary() {
        return this.salary + this.bonus;
    }
}
public class Ques21 {
    public static void main(String[] args) {
//  Problem 1
        // Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(6, 7);

//  Problem 2
        // Rectangle objR = new Rectangle(12, 8);
        Cuboid objR = new Cuboid(6, 7, 10);

//  Problem 3
        Manager obj3 = new Manager(50000, 10000);

        System.out.println("Salary = " + obj3.getSalary());
        System.out.println("Total Salary = " + obj3.totalSalary());

    }
}
