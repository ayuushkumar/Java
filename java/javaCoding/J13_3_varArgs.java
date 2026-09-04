package javaCoding;

public class J13_3_varArgs {

//    static int sum(int a, int b) {
//        return a + b;
//    }
//    static int sum(int a, int b, int c) {
//        return a + b + c;
//    }

//  Using VarArgs
// ========================================
// At least one argument is required

//  static int sum(int x,int ...arr){
//      int result = x;
// ========================================

    static int sum(int ...arr){
    int result = 0;

        for(int a:arr){
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
    }
}
