package javaCoding;

public class J11_1_loops {
    public static void main(String[] args) {

//  While loop

        //while (condition)
        //{
        // Statements    -> This keeps executing as long as the condition is true.
        //}

        System.out.println("Using While Loop");
        int i = 1;
        while(i <= 5){
            System.out.println(i);
            i++;
        }

//===== WARNING! INFINITE WHILE LOOP. =====
//  If the Condition never becomes false, the while loop keeps getting executed.
//  such a loop is known as an infinite loop.

//        System.out.println("This is an infinite loop");
//        while(true){
//            System.out.println("Infinite loop");
//        }


//  Do While loop

        // Execute the code once & then check the condition.

        //do{
        // Statements
        //} while (condition);

        int a = 0;
        do{
            System.out.println(a);
            a++;
        }while(a<5);

//  For loop

        //for(initialize; check_bool_expression; update){
        //code;
        //}

        for(int f=0; f<=10; f++){
            System.out.println(f);
        }

// Decrementing for loop

        for(int d = 5; d != 0; d--){
            System.out.println(d);
        }

    }
}
