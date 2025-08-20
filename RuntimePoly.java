// Parent class
class Device {
    void start() {
        System.out.println("Device is starting...");
    }
}

// Child class 1
class Laptop extends Device {
    @Override
    void start() {
        System.out.println("Laptop is booting up.");
    }
}

// Child class 2
class Phone extends Device {
    @Override
    void start() {
        System.out.println("Phone is powering on.");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        Device d; // reference of parent class

        d = new Laptop(); // Laptop object
        d.start();        // calls Laptop's start()

        d = new Phone();  // Phone object
        d.start();        // calls Phone's start()
    }
}
