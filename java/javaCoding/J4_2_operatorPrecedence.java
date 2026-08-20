package javaCoding;

public class J4_2_operatorPrecedence {
    public static void main(String[] args) {

// =====================================================
//              OPERATOR PRECEDENCE
// =====================================================


        int a = 6 * 5 - 34 / 2;
        // --> * and / have higher precedence than -

        // 6 * 5 = 30
        // 34 / 2 = 17
        // 30 - 17 = 13
        // a = 13


// =====================================================
//              ASSOCIATIVITY
// =====================================================
         // When operators have the SAME precedence,
         // associativity decides the order of evaluation.

         // --> *, / and % have LEFT-TO-RIGHT associativity.

         int b = 60 / 5 * 2;
         // 60 / 5 = 12
         // 12 * 2 = 24
         // b = 24


    }
}