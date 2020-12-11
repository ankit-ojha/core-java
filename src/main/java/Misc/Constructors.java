package Misc;

public class Constructors {

    public static void main(String[] args) {
        B b1 = new B();
        B b = new B("Hello");
    }
}

class B extends Constructors {

    B() {
        System.out.println("B");
    }

    B(String x) {
        System.out.println(x);
    }

}
