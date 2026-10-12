class A {
    void displayA() {
        System.out.println("Class A");
    }
}

class B {
    void displayB() {
        System.out.println("Class B");
    }
}

interface Printable {
    void print();
}

interface Showable {
    void show();
}

class C extends A implements Printable, Showable {
    public void print() {
        System.out.println("Printable interface method");
    }

    public void show() {
        System.out.println("Showable interface method");
    }
}

public class InheritanceConceptMain {
    public static void main(String[] args) {
        C obj = new C();

        obj.displayA();
        obj.print();
        obj.show();

        System.out.println(
                "Java classes can extend only one class.");
        System.out.println(
                "A class can implement multiple interfaces.");
    }
}