package practiceQuestions2;
import java.util.Scanner;

public class Q1_5_ageCategoryClassifier {
    public static void main(String[] args) {

//Easy Question 5
// ============================================================
//   Q. A demographic survey classifies people into categories
//   based on age: Child (0-12), Teenager (13-19),
//   Adult (20-59), and Senior (60+).
//   Write a program that reads an age and prints the category.
// ============================================================

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if(age > 59){
            System.out.println("Senior Citizen");
        }
        else if(age > 19){
            System.out.println("Adult");
        }
        else if(age > 12){
            System.out.println("Teenager");
        }
        else if(age >= 0){
            System.out.println("Child");
        }
        else{
            System.out.println("Invalid age");
        }
    }
}
