public class DataTypesExample {
    public static void main(String[] args) {
        // Primitive Data Types
        byte b = 100;              // 1 byte
        short s = 32000;           // 2 bytes
        int i = 123456789;         // 4 bytes
        long l = 12345678900L;     // 8 bytes
        float f = 3.14f;           // 4 bytes
        double d = 99.99;          // 8 bytes
        char c = 'A';              // 2 bytes (Unicode)
        boolean flag = true;       // 1 bit (true/false)

        // Non-primitive (Reference) Data Type
        String str = "Hello Java"; 

        // Output
        System.out.println("--- Primitive Data Types ---");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("\n--- Non-Primitive Data Type ---");
        System.out.println("String: " + str);
    }
}
