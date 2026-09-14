package javaCoding;

// In Java interface is a group of related methods with empty bodies

interface Bicycle{
    int a = 40;
    void paddle(int increment);
    void breaks(int decrement);
}

interface honking{
    void blowhorn(int increment);
    void nohorn(int decrement);
}

class mtb implements Bicycle,honking{
    @Override
    public void paddle(int increment) {
        System.out.println("Speeding up");
    }

    @Override
    public void breaks(int decrement) {
        System.out.println("Stopping");
    }
    @Override
    public void blowhorn(int increment) {
        System.out.println("Honking");
    }
    @Override
    public void nohorn(int decrement) {
        System.out.println("Stop Honking");
    }
}

public class J18_2_interfaces {
    public static void main(String[] args) {
        mtb cycle = new mtb();
        cycle.paddle(5);
        cycle.breaks(5);

        System.out.println(cycle.a);

//  Can't assign a value to final variable.
//        cycle.a = 70; --> error

        cycle.blowhorn(5);
        cycle.nohorn(5);

    }
}

// We cant extend multiple abstract classes, but we
// can implement multiple interfaces at a time.
// Interfaces are meant for dynamic method dispatch.
