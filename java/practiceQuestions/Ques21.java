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

public class Ques21 {
    public static void main(String[] args) {
// Problem 1
        // Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(6, 7);

    }
}
