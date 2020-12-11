package OOPS.Abstraction;

//abstract class
abstract class Bank {
    abstract int getInterestRate();
}

//concrete class
class Citi extends Bank {
    int getInterestRate() {
        return 7;
    }
}

//concrete class
class HSBC extends Bank {
    int getInterestRate() {
        return 6;
    }
}

public class Abstraction {

    public static void main(String[] args) {
        Bank b;
        b = new Citi();      // concrete class object
        System.out.println("Citi Rate of Interest is: " + b.getInterestRate() + "%");
        b = new HSBC();        // concrete class object
        System.out.println("HSBC Rate of Interest is: " + b.getInterestRate() + "%");
    }
/*
------------------------------------------------------------------------------------------------------------------------

- abstract meaning - existing in thought or as an idea but not having a physical or concrete existence.
- Abstraction is a process of hiding the implementation details and showing only functionality to the user.
- In Java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.
- Example: A man driving a car

------------------------------------------- ABSTRACT CLASS -------------------------------------------------------------

1. 'abstract' keyword while defining the class
2. Abstract class cannot be instantiated (i.e. You cannot do new())
3. It can have abstract and non-abstract (concrete) methods
4. It can have constructors and static methods
5. It can have final methods
6. A method defined abstract must always be redefined in the subclass,thus making overriding compulsory OR either make subclass itself abstract.
7. An abstract class can have parametrized constructors and default constructor is always present in an abstract class.
8. If a class has at least one abstract methods, then the class must be declared as abstract
9. If you inherit an abstract class, you must provide implementations to abstract methods
10. Abstract cannot be private, static and final, as final class cannot be extended which defeats the purpose of abstraction
11.

Why can’t we create the object of an abstract class?
- Because these classes are incomplete, they have abstract methods that have no body so if java allows you to create object of this class
then if someone calls the abstract method using that object then What would happen?
There would be no actual implementation of the method to invoke.
Also because an object is concrete. An abstract class is like a template, so you have to extend it and build on it before you can use it.

--------------------------------------------- INTERFACES ---------------------------------------------------------------

Type of methods: Interface can have only abstract methods. Abstract class can have abstract and non-abstract methods. From Java 8, it can have default and static methods also.
Final Variables: Variables declared in a Java interface are by default final. An abstract class may contain non-final variables.
Type of variables: Abstract class can have final, non-final, static and non-static variables. Interface has only static and final variables.
Implementation: Abstract class can provide the implementation of interface. Interface can’t provide the implementation of abstract class.
Inheritance vs Abstraction: A Java interface can be implemented using keyword “implements” and abstract class can be extended using keyword “extends”.
Multiple implementation: An interface can extend another Java interface only, an abstract class can extend another Java class and implement multiple Java interfaces.
Accessibility of Data Members: Members of a Java interface are public by default. A Java abstract class can have class members like private, protected, etc.

-------------------------------------------- WHEN TO USE ABSTRACT CLASS AND INTERFACES ---------------------------------

https://javabypatel.blogspot.com/2017/07/real-time-example-of-abstract-class-and-interface-in-java.html

- Interface is used when you don't know anything about implementation but know the contract that implementer should have to accomplish the task.
- Abstract class is used when you know partial implementation, where say out of 5 methods,
you know implementation of 3 methods and don't know implementation of 2 methods in that case 2 methods will be abstract
and you need to rely on implementer as a contract to must provide body of abstract methods to accomplish the task.




 */


}
