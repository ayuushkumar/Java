package practiceQuestions;
import java.util.Scanner;

public class Ques2 {


// ======================================================================================
//    Q.Write a program to calculate the percentage of the given students in exam.
//    Marks from 5 subject must be taken as input from the keyboard.
//    (marks are out of 100).
// ======================================================================================


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("English marks : ");
        float english = sc.nextFloat();
        System.out.print("Hindi marks : ");
        float hindi = sc.nextFloat();
        System.out.print("Maths marks : ");
        float maths = sc.nextFloat();
        System.out.print("Science marks : ");
        float science = sc.nextFloat();
        System.out.print("Computer marks : ");
        float computer = sc.nextFloat();

        float total = english + hindi + maths + science + computer;
        float Percentage = (total/ 500.0f)*100;
//      float Percentage = ((english + hindi + maths + science + computer)/500)*100;
        System.out.println("Percentage = " + Percentage + "%");



    }
}
