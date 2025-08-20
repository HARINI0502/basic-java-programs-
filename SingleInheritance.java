// Parent class
class Teacher {
    void teach() {
        System.out.println("Teacher is teaching.");
    }
}

// Child class
class Student extends Teacher {
    void study() {
        System.out.println("Student is studying.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.teach(); // Inherited from Teacher
        s.study(); // Own method
    }
}
