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

    public static void main(String[] args) {

//  Problem 1
        multiplication(7);

// Problem 2
        int x = 5;
        System.out.println("\nFibonacci number "+x+" is: ");
        for(int i=0;i<=x;i++){
            System.out.print(Fibonacci(i)+" ");
        }
    }
}
