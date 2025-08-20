public class OperatorsExample {
    public static void main(String[] args) {
        int a = 10, b = 5;

        // Arithmetic Operators
        System.out.println("--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("\n--- Logical Operators ---");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Assignment Operators
        int c = 10;
        System.out.println("\n--- Assignment Operators ---");
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);
        c %= 3; // c = c % 3
        System.out.println("c %= 3: " + c);

        // Unary Operators
        int d = 7;
        System.out.println("\n--- Unary Operators ---");
        System.out.println("d++ = " + (d++)); // Post-increment
        System.out.println("Now d = " + d);
        System.out.println("++d = " + (++d)); // Pre-increment
        System.out.println("d-- = " + (d--)); // Post-decrement
        System.out.println("--d = " + (--d));

        // Bitwise Operators
        int p = 6, q = 3; // binary: 6 = 110, 3 = 011
        System.out.println("\n--- Bitwise Operators ---");
        System.out.println("p & q = " + (p & q));  // AND
        System.out.println("p | q = " + (p | q));  // OR
        System.out.println("p ^ q = " + (p ^ q));  // XOR
        System.out.println("~p = " + (~p));        // NOT
        System.out.println("p << 1 = " + (p << 1));// Left shift
        System.out.println("p >> 1 = " + (p >> 1));// Right shift
    }
}
