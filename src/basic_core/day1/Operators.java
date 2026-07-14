package basic_core.day1;

public class Operators {
    public static void main (String [] args){

            int a = 10;
            int b = 3;

                //  Arithmetic basic_core.day1.Operators
                System.out.println("Arithmetic basic_core.day1.Operators:");
                System.out.println("a + b = " + (a + b));   // Addition
                System.out.println("a - b = " + (a - b));   // Subtraction
                System.out.println("a * b = " + (a * b));   // Multiplication
                System.out.println("a / b = " + (a / b));   // Division
                System.out.println("a % b = " + (a % b));   // Modulus

                //  Assignment basic_core.day1.Operators
                System.out.println("\nAssignment basic_core.day1.Operators:");
                int c = a;
                c += 5;
                System.out.println("c += 5 → " + c);
                c -= 2;
                System.out.println("c -= 2 → " + c);
                c *= 2;
                System.out.println("c *= 2 → " + c);
                c /= 3;
                System.out.println("c /= 3 → " + c);

                // Relational (Comparison) basic_core.day1.Operators
                System.out.println("\nRelational basic_core.day1.Operators:");
                System.out.println("a == b : " + (a == b));
                System.out.println("a != b : " + (a != b));
                System.out.println("a > b  : " + (a > b));
                System.out.println("a < b  : " + (a < b));
                System.out.println("a >= b : " + (a >= b));
                System.out.println("a <= b : " + (a <= b));

                // Logical basic_core.day1.Operators
                System.out.println("\nLogical basic_core.day1.Operators:");
                boolean x = true;
                boolean y = false;
                System.out.println("x && y : " + (x && y)); // AND
                System.out.println("x || y : " + (x || y)); // OR
                System.out.println("!x     : " + (!x));     // NOT

                // Unary basic_core.day1.Operators
                System.out.println("\nUnary basic_core.day1.Operators:");
                int d = 5;
                System.out.println("d++ = " + (d++)); // Post-increment
                System.out.println("++d = " + (++d)); // Pre-increment
                System.out.println("d-- = " + (d--)); // Post-decrement
                System.out.println("--d = " + (--d)); // Pre-decrement

                // Ternary Operator
                System.out.println("\nTernary Operator:");
                int max = (a > b) ? a : b;
                System.out.println("Max of a and b = " + max);

                //  Bitwise basic_core.day1.Operators
                System.out.println("\nBitwise basic_core.day1.Operators:");
                System.out.println("a & b = " + (a & b)); // AND
                System.out.println("a | b = " + (a | b)); // OR
                System.out.println("a ^ b = " + (a ^ b)); // XOR
                System.out.println("~a    = " + (~a));    // NOT
                System.out.println("a << 1 = " + (a << 1)); // Left shift
                System.out.println("a >> 1 = " + (a >> 1)); // Right shift
            }
        }


