package javaCoding;
import java.util.Scanner;

public class J10_elseIf_And_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        if (age > 50){
            System.out.println("Retire");
        }
        else if( age > 25){
            System.out.println("Promotion");
        }
        else if(age > 18){
            System.out.println("Fresher");
        }
        else if(age > 0){
            System.out.println("Student");
        }
        else{
            System.out.println("Invalid age");
        }


// Switch

        //        char var = 'A';
        //        case 'A'

        //        String str = "JAVA";
        //        case "JAVA"

        System.out.println("This is Switch");
        System.out.print("Enter your age : ");
        int age2 = sc.nextInt();
        int profile;
        if (age2 > 50) {
            profile = 1;
        }else if (age2 > 25){
            profile = 2;
        }else if(age2 > 18){
            profile = 3;
        }else if(age2 > 0){
            profile = 4;
        }else {
            profile = 5;
        }
        switch(profile){
            case 1:
                System.out.println("Retire");
                break;
            case 2:
                System.out.println("Promotion");
                break;
            case 3:
                System.out.println("Fresher");
                break;
            case 4:
                System.out.println("Student");
                break;
            default:
                System.out.println("Invalid");
        }
        sc.close();


// ============== Enhanced Switch ==============

//        System.out.println("This is Enhanced Switch");
//        switch (profile){
//            case 1 -> System.out.println("Retire");
//            case 2 -> System.out.println("Promotion");
//            case 3 -> System.out.println("Fresher");
//            case 4 -> System.out.println("Student");
//            default -> System.out.println("Invalid");
//        }
//        sc.close();

    }
}
