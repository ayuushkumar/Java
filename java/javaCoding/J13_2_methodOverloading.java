package javaCoding;

public class J13_2_methodOverloading {

// ======================================================
//  Void --> When we don't want our method to return
//  anything, we use void as a return type.
// ======================================================

    static void printWorld(){
        System.out.println("Hello World");
    }

// ==========================================================
//  Method overloading - two or more method can have same name
//  but different parameters.
// ==========================================================
    static void Gm(){
        System.out.println("Good Morning");
    }
    static void Gm(String a){
        System.out.println("Good Morning " + a);
    }
    static void Gm(String a,String b){
        System.out.println("Good Morning " + a + " and " + b);
    }

    public static void main(String[] args) {
        printWorld();

// Method Overloading
        Gm();
        Gm("Ayush");
        Gm("Ayush", "Karan");

    }
}
