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
        System.out.println("\nThe sum is: " + sum);

// =============================================================
//  Q.Write a program to find out whether a given number is
//  present in an array or not.
// =============================================================

        float[] marks2= {89.5f, 67.7f, 90.9f, 78.8f, 88.9f};
        float num = 67.7f;
        boolean isInArray = false;
        for(float find: marks2){
            if(num==find){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("\nThe number is in the array");
        }else{
            System.out.println("\nThe number is not in the array");
        }

// =============================================================
//  Q.Calculate the average marks from an array containing
//  marks of all students using for-each loop.
// =============================================================

        float[] marks3= {89.5f, 67.7f, 90.9f, 78.8f, 88.9f};
        float sum2=0;
        for(float avg: marks3){
            sum2 += avg;
        }
        System.out.println("\nThe average of the class is: " + sum/marks3.length);

// =============================================================
//  Q.Create a java program to add two matrices of size 2X3.
// =============================================================

        int[][] mat1 = {{2,3,4},{5,6,7}};
        int[][] mat2 = {{1,2,3},{4,5,6}};
        int[][] result = {{0,0,0},{0,0,0}};
        System.out.print("\n");
        for(int i=0; i<mat1.length;i++){
            for(int j=0; j<mat1[i].length; j++){
                result [i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
