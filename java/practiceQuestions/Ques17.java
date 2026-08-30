package practiceQuestions;

public class Ques17 {
    public static void main(String[] args) {

// =============================================================
//  Q.Create an array of 5 float and calculate their sum.
// =============================================================

        float[] marks= {89.5f, 67.7f, 90.9f, 78.8f, 88.9f};
        float sum=0;
        for(float addition: marks){
            sum += addition;
        }
        System.out.println("The sum is: " + sum);
    }
}
