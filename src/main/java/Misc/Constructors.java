package Misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Constructors {

    public static void main(String[] args) {
        B b1 = new B();
        B b = new B("Hello");
        WebDriver driver = new ChromeDriver();
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
