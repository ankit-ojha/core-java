package OOPS.Polymorphism;

public class Examples {

    public static void main(String[] args) {

        // create an object of Java class
        Java j1 = new Java();
        j1.displayInfo();

        // create an object of Language class
        Language l1 = new Language();
        l1.displayInfo();

        Language l2 = new Java();
        l2.displayInfo();

    }
}

class Language {
    protected void displayInfo() {
        System.out.println("Common English Language");
    }

    public void sum() {

    }


    protected void sum(int a) {

    }

}

class Java extends Language {
    @Override
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }
}

