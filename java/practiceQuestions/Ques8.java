package practiceQuestions;

public class Ques8 {
    public static void main(String[] args) {

// =========================================================================
//  Q. Write a java program to encrypt a grade by adding 8 to it.
//     Decrypt it by showing the correct grade.
// =========================================================================

// Encrypting
        char grade = 'A';
        grade = (char)(grade + 8);
        System.out.println(grade);

// Decrypting
        grade = (char)(grade - 8);
        System.out.println(grade);


    }
}
