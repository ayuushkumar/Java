package javaCoding;

public class J11_loops {
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

//  If the Condition never becomes false, the while loop keeps getting executed.
//  such a loop is known as an infinite loop.

        System.out.println("This is an infinite loop");
        while(true){
            System.out.println("Infinite loop");
        }
    }
}
