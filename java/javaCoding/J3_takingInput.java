package javaCoding;

import java.util.Scanner;

public class J3_takingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum of the numbers = " + sum);

    }
}
