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

// =================================================================
//  Q.Write a java program to find the maximum element in an array.
// =================================================================

        int[] maximum = {60,70,80,90,99,50,65};
        int max = Integer.MIN_VALUE; // Value of MIN_VALUE --> -2147483648
        for(int e: maximum){
            if(e > max){
                max = e;
            }
        }
        System.out.println("\nThe maximum element is: " + max);

//        for(int i=0; i<maximum.length;i++){
//            if(max<maximum[i]){
//                max =  maximum[i];
//            }
//        }
//        System.out.println("\nThe maximum number is: " + max);

// =================================================================
//  Q.Write a java program to find the maximum element in an array.
// =================================================================

        int[] minimum = {-98, 89, 87, -90, 55, 100};
        int min = Integer.MAX_VALUE; // Value of MAX_VALUE --> 2147483647
        for(int m:minimum ){
            if(m < min){
                min = m;
            }
        }
        System.out.println("\nThe minimum element is: " + min);

// ===================================================================
//  Q.Write a java program to find whether an array is sorted or not.
// ===================================================================

        boolean isSorted = true;
        int[] arr = {34,56,67,90,99}; // true
        // int[] arr = {34,70,67,100,99}; // false
        for(int i=0; i < arr.length-1;i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("\nThe Array is sorted");
        }else{
            System.out.println("\nThe Array is not sorted");
        }
    }
}
