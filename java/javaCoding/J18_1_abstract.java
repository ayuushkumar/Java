package javaCoding;

// Abstract in English means --> existing in thought or as
//  an idea without concrete existence.

// Abstract Method --> A method that is declared without an implementation.

abstract class Parent{
    public Parent(){
        System.out.println("I am Parent constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}

class Child2 extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}

abstract class Child3 extends Parent{
    public void kid(){
        System.out.println("I am good");
    }
}

public class J18_1_abstract {
    public static void main(String[] args) {

        //Parent p = new Parent(); -- error
        Child2 c = new Child2();
        //Child3 c3 = new Child3(); -- error

    }
}
