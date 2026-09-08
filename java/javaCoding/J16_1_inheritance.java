package javaCoding;

// Inheritance --> Inheritance is used to borrow properties & methods
// from an existing class.

class Base{
    int x;

    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
}

//Inheritance in Java is declared using extends keyword.
class Child extends Base {
    int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    }
}

public class J16_1_inheritance {
    public static void main(String[] args) {
        Base base = new Base();
        base.setX(10);
        System.out.println(base.getX());

//  Inherit from base
        Child child = new Child();
        child.setX(15);
        System.out.println(child.getX());
        child.setY(20);
        System.out.println(child.getY());
    }
}
