package javaCoding;

public class J4_Operators {
    public static void main(String[] args) {

// ================= MODULO OPERATOR (%) =================
        int a = 10;
        int b = 3;
        System.out.println(a % b);
        // Gives the remainder after division.

// ================= ASSIGNMENT OPERATORS =================
        int num = 10;
        num += 5;    // num = num + 5
        num -= 3;    // num = num - 3
        num *= 2;    // num = num * 2
        num /= 4;    // num = num / 4


// ================= COMPARISON OPERATORS =================
        int num1 = 67;
        int num2 = 69;

        System.out.println(num1 > num2);    // false
        System.out.println(num1 < num2);    // true
        System.out.println(num1 == num2);   // false
        System.out.println(num1 != num2);   // true
        System.out.println(num1 >= num2);   // false
        System.out.println(num1 <= num2);   // true

// ================= LOGICAL OPERATORS =================
        // && = AND --> both conditions must be true
        System.out.println(num1 < num2 && num2 > num1);  // true

        // || = OR --> at least one condition must be true
        System.out.println(num1 > num2 || num2 > num1);  // true

        // ! = NOT --> reverses the result
        System.out.println(!(num1 > num2));              // true
    }
}