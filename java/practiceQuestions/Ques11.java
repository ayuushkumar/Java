package practiceQuestions;

public class Ques11 {
    public static void main(String[] args) {

// ==================================================================
// Q. Write a java program to detect Double spaces and Triple spaces.
// ==================================================================

        String str = "This contains  Double and   Triple spaces";
        System.out.println(str.indexOf("  "));
        System.out.println(str.indexOf("   "));
    }
}
