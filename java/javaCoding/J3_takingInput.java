package javaCoding;

import java.util.Scanner;

public class J3_takingInput {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in); // Creates Scanner object to take input from keyboard.
        System.out.print("Enter your first number: ");
        int num1 = sc.nextInt(); //Stores the input.
        System.out.print("Enter your second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.print("Sum of the numbers = " + sum);

/*
==================- CAN ALSO USE -======================

        float a = sc.nextFloat();
        short s = sc.nextShort();
        byte b = sc.nextByte();
        long l = sc.nextLong();
        double d = sc.nextDouble();
        boolean bool = sc.hasNextInt(); --> int,float,byte,short etc.
        String str = sc.next();
        String str = sc.nextLine();
*/

    }
}

