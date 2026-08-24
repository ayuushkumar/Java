package practiceQuestions2;
import java.util.Scanner;

public class Q1_2_evenOrOddChecker {
    public static void main(String[] args) {

//Easy Question 2
// =================================================================
//  Q.  A school teacher wants to quickly determine if a student's
//      roll number is even or odd. Write a program
//      that reads an integer and prints whether it is even or odd.
// ===================================================================

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int on = sc.nextInt();
        if(on % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
