package practiceQuestions;

import java.sql.SQLOutput;

public class Ques18 {

// ============================================================
//  Q. Write a java program using methods to print
//  multiplication table of a number n
// ============================================================

    static void multiplication(int n){
        for(int i = 1; i<=10; i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
// ============================================================
//  Q. Write a java program to print Fibonacci series
//  (recursion must be used)
// ============================================================

    static int Fibonacci(int f){
        if(f==0 || f==1){
            return f;
        }else{
            return Fibonacci(f-1)+Fibonacci(f-2);
        }
    }

// ==================================================================
//  Q. Write a program using function to print the following pattern
//      *
//      **
//      ***
//      ****
// ==================================================================

    static void pattern(int p){
        for(int i=1; i<=p; i++){
            for(int j=i; j>0; j--){
                System.out.print("*");;
            }
            System.out.print("\n");
        }
    }

// ======================================================
//  Q. Write a recursive function to calculate the sum of
//      first n natural numbers.
// ======================================================

    static int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n + sum(n - 1);
        }
    }

// ===================================================================
//  Q. Write a program using function to print the following pattern
//      *****
//      ****
//      ***
//      **
//      *
// ===================================================================

    static void pattern2(int p){
        for(int i=p; i>0; i--){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

//  Problem 1
        multiplication(7);

//  Problem 2
        int x = 5;
        System.out.println("\nFibonacci number "+x+" is: ");
        for(int i=0;i<=x;i++){
            System.out.print(Fibonacci(i)+" ");
        }

//  Problem 3
        int s = 4;
        System.out.println("\n\nPattern for "+s+" number is: ");
        pattern(s);

//  Problem 4
        int c = 3;
        System.out.println("\nThe sum of first "+c+" natiral numbers is: "+sum(c));

//  Problem 5
        int s2 = 5;
        System.out.println("\nPattern for "+s2+" number is: " );
        pattern2(s2);

    }
}
