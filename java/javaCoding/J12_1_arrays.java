package javaCoding;

public class J12_1_arrays {
    public static void main(String[] args) {

        // There are three main ways to create an array in Java

// 1. Declaration and memory allocation

        int [] marks = new int[5];

//      Initialization
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 86;
        //marks3[5] = 96; - throws an error

        System.out.println(marks[2]);

// 2. Declaration and then memory allocation

        int [] marks2;
        marks2 = new int[5];

//      Initialization
        marks2[0] = 100;
        marks2[1] = 60;
        marks2[2] = 70;
        marks2[3] = 90;
        marks2[4] = 86;
        System.out.println(marks2[4]);

// 3. Declaration, memory allocation and initialization together

        int [] marks3 = {98, 45, 79, 99, 80};
        System.out.println(marks3[4]);

    }
}
