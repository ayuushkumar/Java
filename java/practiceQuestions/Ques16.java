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

// ======================================================================
//  Q.Write a program to print multiplication table of the given number.
// ======================================================================

        System.out.println("\nMultiplication table");
        int num = 5;
        for(int i=1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",num,i,i*num);
        }
    }
}
