package javaCoding;

public class J12_2_forEachLoop {
    public static void main(String[] args) {

        // Arrays Methods
        int [] marks = {50, 60, 70, 80, 90, 100};
        System.out.println("Length of the Array is: "+ marks.length);

        // Displaying The Array
        System.out.println("\nDisplaying the Arrays");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        // Displaying the Array using for loop
        System.out.println("\nDisplaying the Arrays using for loop");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        //Displaying the Array using for loop in reverse order
        System.out.println("\nDisplaying the Arrays in reverse");
        for(int i=marks.length -1; i>=0; i--){
            System.out.println(marks[i]);
        }

        // Displaying the Array use for-each loop
        System.out.println("\nDisplaying the Arrays using for-each loop");
        for(int element: marks){
            System.out.println(element);


//Can Also Use Different Literals -->

//        float[] marks = {20.5f,30.5f,40.5f,50.5f,60.5f};
//        String [] students = {"Ayush", "Somiya", "Rekha", "Rohit"};
        }
    }
}
