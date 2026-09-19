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

public class Ques22 {
    public static void main(String[] args) {

// Problem 1
        BallPen pen = new BallPen();
        pen.refill();
        pen.write();

    }
}
