package practiceQuestions;

public class Ques14 {
    public static void main(String[] args) {

// =======================================================================
//  Q.Write a java program to print first n odd numbers using a for loop.
// =======================================================================

        // 2n = Even (0, 2, 4, 6, 8, 10)
        // 2n+1 = Odd (1, 3, 5, 6, 7, 9)

        int n =5;
        System.out.println("Odd numbers :");
        for(int i=0; i<n; i++){
            System.out.println(2*i+1);
        }

    }
}
