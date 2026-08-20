package javaCoding;

public class J5_incrementAndDecrement {
    public static void main(String[] args) {

// =====================================================
//          INCREMENT & DECREMENT OPERATORS
// =====================================================

        // Increment (++)  → increases value by 1
        // Decrement (--)  → decreases value by 1

        int i = 56;

//  (i++)
        // First use the current value
        // Then increase the value by 1

        System.out.println(i++);
        // Prints: 56
        // Then i becomes: 57

// (++i)
        // First increase the value by 1
        // Then use the new value

        System.out.println(++i);
        // i becomes: 58
        // Prints: 58

// (i--)
        // First use the current value
        // Then decrease the value by 1

        System.out.println(i--);
        // Prints: 58
        // Then i becomes: 57

// (--i)

        // First decrease the value by 1
        // Then use the new value

        System.out.println(--i);
        // i becomes: 56
        // Prints: 56

// =====================================================

        int y = 7;

        System.out.println(++y * 8);
        // First: ++y → 8
        // Then: 8 * 8 → 64
        // Prints: 64

// =====================================================
//              INCREMENT WITH CHAR
// =====================================================

        char ch = 'a';

        System.out.println(++ch);
        // Character 'a' is increased by 1
        // 'a' → 'b'
        // Prints: b

// =====================================================
        // i++  → Use first, increase later
        // ++i  → Increase first, use later
        // i--  → Use first, decrease later
        // --i  → Decrease first, use later

    }
}