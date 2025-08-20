// File: AccessDemo.java
class A {
    public int pubVar = 10;      // Public → accessible everywhere
    protected int proVar = 20;   // Protected → package + subclass
    int defVar = 30;             // Default → package only
    private int priVar = 40;     // Private → same class only

    public void showAll() {
        System.out.println("Inside class A:");
        System.out.println("public: " + pubVar);
        System.out.println("protected: " + proVar);
        System.out.println("default: " + defVar);
        System.out.println("private: " + priVar);
    }
}

public class AccessDemo {
    public static void main(String[] args) {
        A obj = new A();

        System.out.println("Accessing from class B (same package):");
        System.out.println("public: " + obj.pubVar);     // ✅ Allowed
        System.out.println("protected: " + obj.proVar);  // ✅ Allowed (same package)
        System.out.println("default: " + obj.defVar);    // ✅ Allowed (same package)
        // System.out.println("private: " + obj.priVar); // ❌ ERROR (private)

        obj.showAll(); // ✅ private accessible via method
    }
}
