import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter your height (in cm): ");
        double height = sc.nextDouble();
        
        System.out.println("\nName: " + name + ", Age: " + age + ", Height: " + height + " cm");
        
        sc.close();
    }
}
