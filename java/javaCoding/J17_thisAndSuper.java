package javaCoding;

// this Keyword -->
// this is a way for us to reference an object of the class
// which is being created /referenced.

class thisKey{
    int a;
    public int getA(){
        return a;
    }
    thisKey(int a){
        this.a = a;
    }
}

// Super Keyword -->
// A reference variable used to refer immediate parent class object.
class superKey extends thisKey{
    superKey(int c){
        super(c);
        System.out.println("superKey");
    }

}

public class J17_thisAndSuper {
    public static void main(String[] args) {
        thisKey tk =  new thisKey(7);
        superKey sk =  new superKey(5);
        System.out.println(tk.getA());
    }

}
