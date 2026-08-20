package javaCoding;
import java.util.Scanner;

public class J6_String {
    public static void main(String[] args) {

//      String name = new String("JAVA");
        String name = "AYUSH";
        System.out.println("The name is : " + name);

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);


// Different ways to print in java.
        int age = 21;
        float height = 182.0f;
        System.out.printf("Your name is %s, age is %d, height is %f", name, age, height);

    }
}
