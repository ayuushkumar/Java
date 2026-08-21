package practiceQuestions;
import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {

// ==================================================================
//  Q. Use a comparison operator to find out whether a given number
//     is greater than the user entered number or not.
// ==================================================================

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The number greater then given number? " + (num > 8));

    }

}
