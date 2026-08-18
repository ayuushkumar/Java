package practiceQuestions;
import java.util.Scanner;

public class pQues1 {

    /*
    Write a program to calculate the percentage of the given students in exam.
    Marks from 5 subject must be taken as input from the keyboard.
    (marks are out of 100).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("English marks : ");
        float english = sc.nextFloat();
        System.out.println("Hindi marks : ");
        float hindi = sc.nextFloat();
        System.out.println("Maths marks : ");
        float maths = sc.nextFloat();
        System.out.println("Science marks : ");
        float science = sc.nextFloat();
        System.out.println("Computer marks : ");
        float computer = sc.nextFloat();

        float total = english + hindi + maths + science + computer;
        float Percentage = (total/ 500.0f)*100;
        System.out.println("Percentage = " + Percentage + "%");



    }
}
