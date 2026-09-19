package practiceQuestions;

// =====================================================
//  Q. Create an abstract class Pen with methods
//  Write(), refil() and changeNib as abstract methods
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
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

public class Ques22 {
    public static void main(String[] args) {

// Problem 1
        BallPen pen = new BallPen();
        pen.changeNib();
        pen.refill();
        pen.write();

    }
}
