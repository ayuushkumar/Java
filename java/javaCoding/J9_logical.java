package javaCoding;

public class J9_logical {
    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        if(a && b){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }

        if(a || b){
            System.out.println("Y");
        }else{
            System.out.println("N");
        }

// ======= There are three types of logical operators in Java =======
//
//       && - AND
//       || - OR
//       ! – NOT

//  AND Operator :
// ======= Evaluates to true if both the conditions are true =======
//
//      Y && Y = Y
//      Y && N = N
//      N && Y = N
//      N && N = N

//  OR Operator :
// ======= Evaluates to true when at least one of the conditions is true =======
//
//        Y || Y = Y
//        Y || N = Y
//        N || Y = Y
//        N || N = N

//  NOT Operator :
// ======= Negates the given logic (true becomes false and vice-versa) =======
//
//        !Y = N
//        !N = Y


    }
}
