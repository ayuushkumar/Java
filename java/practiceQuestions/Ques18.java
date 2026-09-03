package practiceQuestions;

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
    public static void main(String[] args) {

//  Problem 1
        multiplication(7);
    }
}
