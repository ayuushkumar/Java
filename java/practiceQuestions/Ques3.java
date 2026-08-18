package practiceQuestions;
import java.util.Scanner;

public class Ques3 {
    /*
    Write a java program which asks the user to enter his/her name
    and greets them with "Hello <name>, have a good day!" text.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = input.nextLine();
        System.out.println("Hello "+ name +", have a great day!");


    }
}
