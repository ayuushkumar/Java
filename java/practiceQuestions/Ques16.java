package practiceQuestions;

public class Ques16 {
    public static void main(String[] args) {

// =================================================================
//  Q.Write a program to sum first n even numbers using while loop.
// =================================================================

//  First 5 even numbers
        System.out.println("Sum of Even number");
        int n = 0;
        int sum = 0;
        while(n<5){
            sum = sum + (2*n);
            n++;
        }
        System.out.println(sum);

    }
}
