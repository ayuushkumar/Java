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

    }
}
