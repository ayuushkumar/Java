package practiceQuestions;

// =====================================================
//  Q. Create an abstract class Pen with methods
//  Write() and refil() as abstract methods
// =====================================================

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class BallPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
}

// =========================================================
//  Q. Use the Pen Class from Q1 to create a Concrete class
//  Fountain Pen with additional method changeNib()
// =========================================================
class FountainPen extends Pen{
    void write(){
        System.out.println("Write with Fountain pen");
    }
    void refill(){
        System.out.println("Refill Fountain pen");
    }
    void changeNib(){
        System.out.println("Changing the Nib of Fountain pen");
    }
}

// ================================================================
//  Q. Create a class Monkey with jump() and bite() methods.
//  Create a class Human which inherits this Monkey class and
//  implements BasicAnimal interface with eat() and sleep methods.
// ================================================================

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class Ques22 {
    public static void main(String[] args) {

//  Problem 1
        BallPen pen = new BallPen();
        pen.refill();
        pen.write();

//  Problem 2
        FountainPen fp = new FountainPen();
        fp.changeNib();
        fp.write();
        fp.refill();

//  Problem 3
        Human human = new Human();
        human.sleep();

// ===============================================================
//  Q.Demonstrate polymorphism using monkey  class from Q3
// ===============================================================

//  Problem 4
        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak(); --> error

        BasicAnimal Banimal = new Human();
        // lovish.speak(); --> error
        Banimal.eat();
        Banimal.sleep();

    }
}
