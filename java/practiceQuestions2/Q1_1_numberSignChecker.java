package practiceQuestions2;
import java.util.Scanner;

public class Q1_1_numberSignChecker {
    public static void main(String[] args) {

//  Easy Question
// ================================================================
//  Q.A program needs to check whether a given integer is
//    positive, negative, or zero. Write a program that
//    takes an integer and prints the appropriate message.
// =================================================================


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
         int num = sc.nextInt();
         if( num > 0){
             System.out.println("Positive");
         }
         else if(num < 0){
             System.out.println("Negative");
         }
         else{System.out.println("Zero");}


    }
}
