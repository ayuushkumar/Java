package javaCoding;

class Base1{
    // Constructor
    Base1(){
        System.out.println("Base1");
    }

    // Overloaded Constructor
    Base1(int a){
        System.out.println("Overloaded constructor with the value " + a);
    }
}

class derived1 extends Base1{

    derived1(){
        System.out.println("derived1");
    }

    derived1(int a, int b){
//  super(0);
//  If we want to call the constructor with the parameters from the parent class, we can use Super keyword.
        super(a);
        System.out.println("derived1 with the value " + b);
    }
}

class childOfDerived1 extends derived1{
    childOfDerived1(){
        System.out.println("childOfDerived1");
    }
    childOfDerived1(int a, int b, int c){
        super(a,b);
        System.out.println("childOfDerived1 with the value " + c);
    }
}

public class J16_2_constructors {
    public static void main(String[] args) {

        Base1 base1 = new Base1();
        derived1 derived1 = new derived1(6,7);
        childOfDerived1 cd = new childOfDerived1(9,10,11);
        
    }
}
