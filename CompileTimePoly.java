class Calculator {
    // Method Overloading (same method name, different parameters)
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class CompileTimePoly {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Sum of 2 ints: " + calc.add(5, 10));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 4.5));
        System.out.println("Sum of 3 ints: " + calc.add(1, 2, 3));
    }
}
