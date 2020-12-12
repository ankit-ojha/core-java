package OOPS.Inheritance;

public class Inheritance {

    public static void main(String[] args) {
        A a = new B();
        a.sum();

        B b = new B();
        b.sum();


    }
}

class A {
    public void sum() {
        System.out.println("Sum of A");
    }
}

class B extends A {
    @Override
    public void sum() {
        System.out.println("Sum of B");
    }
}
