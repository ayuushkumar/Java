package practiceQuestions;
import java.util.Scanner;

public class Ques5 {

// ==================================================================================
//    Q.write a java program to detect whether a number entered by the user
//    is integer or not.
// ==================================================================================

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to check: ");
        System.out.println(sc.hasNextInt());
    }
}
