package javaCoding;

public class J7_stringMethods {
    public static void main(String[] args) {

//                     0 1 2 3 4
//      String name = "A y u s h";
        String name = "Ayush";

//=========================================
//      To print the Length
// ========================================

        int value  = name.length();
        System.out.println(value);

// ========================================
//      To print in Lower Case
// ========================================

        String lstring = name.toLowerCase();
        System.out.println(lstring);

// ========================================
//      To print in Upper Case
// ========================================

        String ustring = name.toUpperCase();
        System.out.println(ustring);

// ========================================
//      To remove the spaces
// ========================================

        String name2 = "     Ayush     ";
        System.out.println(name2); // With Spaces
        System.out.println(name2.trim()); //without Spaces

// ========================================
//      Return the substring from start to end.
// ========================================

        String endstring = name.substring(3);
        System.out.println(endstring); // sh

        String startstring = name.substring(0, 3);
        System.out.println(startstring); // Ayu

// ========================================
//      To replace the char/string.
// ========================================

        String name3 = "Harry";
        String rstr = name3.replace('r','p');
        System.out.println(rstr);

        String str2 = name3.replace("rry","ier");
        System.out.println(str2);

// ========================================
//      Starts with, Ends with.
// ========================================

        System.out.println(name.startsWith("Ayu"));
        System.out.println(name.endsWith("Ayu"));

// ========================================
//      Character at, Index of the character,
// ========================================
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("s"));

        String name4 = "Ayushkumar";
        System.out.println(name4.indexOf("u",4));

        //From last
        System.out.println(name4.lastIndexOf("u",4));

// ========================================
//      Equals
// ========================================

        System.out.println(name.equals("Ayushkumar"));
        System.out.println(name.equalsIgnoreCase("ayush"));

// ========================================
//      Escape sequence character.
// ========================================
        System.out.println(" --> \" double quote ");
        // \n. \t, \', \\ etc.





    }
}
