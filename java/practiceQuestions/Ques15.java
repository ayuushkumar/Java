package practiceQuestions;

public class Ques15 {
    public static void main(String[] args) {

// ========================================================
//  Q. Write a program to print the following pattern
//      ****
//      ***
//      **
//      *
// ========================================================

        int s = 4;
        for(int i=s; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

// ========================================================
//  Q. Write a program to print the following pattern
//      *
//      **
//      ***
//      ****
// ========================================================

        int s2 = 4;
        for(int i=1; i<=s2; i++){
            for(int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.print("\n");
            }
        }
    }

