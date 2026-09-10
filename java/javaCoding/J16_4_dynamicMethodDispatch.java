package javaCoding;

class Phone{

    public void on(){
        System.out.println("Turning on Phone");
    }
    public void time(){
        System.out.println("O'clock");
    }
}
class SmartPhone extends Phone{

    public void on(){
        System.out.println("Turning on SmartPhone");
    }
    public void music(){
        System.out.println("Play Music");
    }
}

public class J16_4_dynamicMethodDispatch {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.time();
        System.out.println();

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.music();
        System.out.println();

//  Dynamic Method Dispatch --> is a mechanism in Java where the method
//  that gets executed is determined at runtime, not at compile time.

        Phone device = new SmartPhone();
        device.on();
//        device.music(); --> error
    }
}
