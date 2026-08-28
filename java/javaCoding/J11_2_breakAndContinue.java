package javaCoding;

public class J11_2_breakAndContinue {
    public static void main(String[] args) {

// ========== Break ==========

        int a = 5;
        for(int i=0; i<a; i++){
            System.out.println(i);
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }

// ========== Continue ==========

        int b = 5;
        for(int i=0; i<b; i++){
            if(i==2){
                System.out.println("This is 2");
                continue;
            }
            System.out.println(i);
        }
    }
}
