package javaCoding;

public class J12_3_multidimensionalArrays {
    public static void main(String[] args) {

//        int [] marks --> 1-D Array
//        int[][] rooms --> 2-D Array
//        int[][][] flats --> 3-D Array
//        .....And so on.

        int[][] rooms = new int[2][3];
        rooms[0][0] = 101;
        rooms[0][1] = 102;
        rooms[0][2] = 103;
        rooms[1][0] = 201;
        rooms[1][1] = 202;
        rooms[1][2] = 203;

        // Displaying the 2-D Array using for loop
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0; i<rooms.length; i++){
            for(int j=0; j<rooms[i].length; j++){
                System.out.print(rooms[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
