public class ControlStatementsExample {
    public static void main(String[] args) {
        int num = 10;

        // --- If-else ---
        System.out.println("--- If-Else ---");
        if (num > 0) {
            System.out.println(num + " is positive");
        } else {
            System.out.println(num + " is non-positive");
        }

        // --- If-else-if ---
        System.out.println("\n--- If-Else-If ---");
        if (num < 0) {
            System.out.println("Negative");
        } else if (num == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Positive");
        }

        // --- Switch ---
        System.out.println("\n--- Switch ---");
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other Day");
        }

        // --- For loop ---
        System.out.println("\n--- For Loop ---");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // --- While loop ---
        System.out.println("\n\n--- While Loop ---");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        // --- Do-While loop ---
        System.out.println("\n\n--- Do-While Loop ---");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 5);

        // --- For-each loop ---
        System.out.println("\n\n--- For-Each Loop ---");
        int[] arr = {10, 20, 30};
        for (int val : arr) {
            System.out.print(val + " ");
        }

        // --- Break and Continue ---
        System.out.println("\n\n--- Break and Continue ---");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                System.out.println("Skipping 3");
                continue; // skip this iteration
            }
            if (k == 5) {
                System.out.println("Breaking at 5");
                break; // exit loop
            }
            System.out.println("k = " + k);
        }
    }
}
