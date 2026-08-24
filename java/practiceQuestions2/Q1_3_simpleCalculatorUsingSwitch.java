package practiceQuestions2;
import java.util.Scanner;

public class Q1_3_simpleCalculatorUsingSwitch {
    public static void main(String[] args) {

//Easy question 3
// ===============================================================
//   Q. Build a simple calculator that performs addition, subtraction,
//      multiplication, or division based on user choice.
//      The user enters two numbers and a choice
//      (1=Add, 2=Subtract, 3=Multiply, 4=Divide).
//      Use a switch statement to select the operation.
//      Handle division by zero gracefully.
// ===============================================================

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your 2nd Number: ");
        int num2 = sc.nextInt();
        System.out.println("1 = Addition");
        System.out.println("2 = Subtraction");
        System.out.println("3 = Multiplication");
        System.out.println("4 = Division");
        System.out.print("Choose your method : ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.print("Addition of your numbers are : "+(num1 + num2));
                break;
            case 2:
                System.out.print("Subtraction of your numbers are : "+(num1 - num2));
                break;
            case 3:
                System.out.print("Multiplication of your numbers are : "+(num1 * num2));
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("Error! Enter a number greater than 0");
                }else{
                System.out.print("Division of your numbers are : "+(num1 / num2));}
                break;
            default:
                System.out.println("Invalid choice");

        }

    }
}
