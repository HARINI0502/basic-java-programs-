// Parent class
class Device {
    void powerOn() {
        System.out.println("Device is powering on.");
    }
}

// Child class 1
class Laptop extends Device {
    void code() {
        System.out.println("Laptop is used for coding.");
    }
}

// Child class 2
class Phone extends Device {
    void call() {
        System.out.println("Phone is used for calling.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Laptop l = new Laptop();
        l.powerOn();
        l.code();

        Phone p = new Phone();
        p.powerOn();
        p.call();
    }
}
