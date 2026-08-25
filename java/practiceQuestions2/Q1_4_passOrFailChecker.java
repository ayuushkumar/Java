package practiceQuestions2;
import java.util.Scanner;

public class Q1_4_passOrFailChecker {
    public static void main(String[] args) {

//Easy Question 4
// =======================================================================
//  Q. A university evaluates students based on marks in two subjects.
//     A student passes only if they score 40 or above in BOTH subjects.
//     Write a program that reads two marks and prints
//     "Pass" or "Fail" accordingly.
// ========================================================================

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of sub 1 : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the marks of sub 2 : ");
        int num2 = sc.nextInt();
        if(num1 >= 40 && num2 >= 40){
        System.out.print("Pass");
        }
        else{
         System.out.print("Fail");
        }
    }
}
