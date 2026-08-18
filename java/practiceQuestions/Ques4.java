package practiceQuestions;
import java.util.Scanner;

public class Ques4 {

//  Q.Write a java program to convert kilometer into miles.

    public static void main(String[] args) {
        Scanner km = new Scanner (System.in);
        System.out.println("Enter kilometers : ");
        int kilometers = km.nextInt();
        float miles = kilometers * 0.621371f;
        System.out.println("Total miles : " + miles);

    }
}
