package javaCoding;

public class J13_1_methods {

    // DataType name(){
    // Method Body
    // }
// =======================================================
    // Following Method returns sum of two numbers --
    // int mySum (int a, int b){
    //      int c = a + b;
    //      return c;
    //      }
// =======================================================

    static int logic(int x, int y){
        int z;
        if(x<y){
            z = x+y;
        }else{
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 7;
        int b = 6;
        int c  = logic(a,b);
        System.out.println(c);

//        if(a>b){
//            c = a+b;
//        }else{
//            c = (a+b)*5;
//        }

        int a1 = 6;
        int b1 = 7;
        int c1 = logic(a1,b1);
        System.out.println(c1);
    }
}
