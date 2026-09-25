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

// =====================================================
// Q. Create a class Telephone with ring(), lift() and
// disconnect() methods as abstract methods.
// Create another class SmartTelephone and demonstrate
// polymorphism.
// =====================================================

abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone {

    @Override
    void ring() {
        System.out.println("Smart Telephone is ringing...");
    }

    @Override
    void lift() {
        System.out.println("Smart Telephone call picked up...");
    }

    @Override
    void disconnect() {
        System.out.println("Smart Telephone call disconnected...");
    }

    void browseInternet() {
        System.out.println("Browsing Internet...");
    }
}

// =====================================================
// Q. Create an Interface TVRemote and use it to inherit
// another Interface SmartTVRemote
// =====================================================

interface TVRemote {

    void powerOn();
    void powerOff();
    void changeChannel();
}

interface SmartTVRemote extends TVRemote {

    void connectToWifi();
    void openNetflix();
}

class SmartTV implements SmartTVRemote {

    @Override
    public void powerOn() {
        System.out.println("TV turned ON");
    }

    @Override
    public void powerOff() {
        System.out.println("TV turned OFF");
    }

    @Override
    public void changeChannel() {
        System.out.println("Channel changed");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Connected to WiFi");
    }

    @Override
    public void openNetflix() {
        System.out.println("Opening Netflix");
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

//  Problem 5 - Polymorphism
        Telephone phone = new SmartTelephone();

        phone.ring();
        phone.lift();
        phone.disconnect();
        //  phone.browseInternet(); --> error

//  Problem 6
        SmartTV tv = new SmartTV();

        tv.powerOn();
        tv.changeChannel();
        tv.connectToWifi();
        tv.openNetflix();
        tv.powerOff();

    }
}
