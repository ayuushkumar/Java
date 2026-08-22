package javaCoding;

public class J2_literals {
    public static void main(String[] args) {

// 1. BYTE
        // Size: 1 byte = 8 bits
        // Range: -128 to 127
        byte a = 127;
        System.out.println(a);

// 2. SHORT
        // Size: 2 bytes = 16 bits
        // Range: -32,768 to 32,767
        short s = 100;
        System.out.println(s);

//3. INT
        // Size: 4 bytes = 32 bits
        // Range: -2^31 to 2^31 - 1
        // Most commonly used for whole numbers
        int b = 10000;
        System.out.println(b);


// 4. LONG
        // Size: 8 bytes = 64 bits
        // Used for very large whole numbers
        // 'L' is written at the end of the value
        long l = 2000000000000L;
        System.out.println(l);


// 5. CHAR
        // Size: 2 bytes = 16 bits
        // Stores a single character
        // Character must be written inside single quotes
        char c = 'A';
        System.out.println(c);


// 6. FLOAT
        // Size: 4 bytes = 32 bits
        // Used for decimal numbers
        // 'f' is written at the end
        float f = 3.14f;
        System.out.println(f);

// 7. DOUBLE
        // Size: 8 bytes = 64 bits
        // Used for decimal numbers
        // More precise than float
        // 'd' is optional because decimal values
        // are double by default
        double d = 1.23d;
        System.out.println(d);

// 8. BOOLEAN
        // Stores only two values:
        // true or false
        boolean bool = true;
        System.out.println(bool);

// 9. STRING
        // String stores a sequence of characters
        // Written inside double quotes
        String str = "Hello World";
        System.out.println(str);

    }
}
