package OOPS.Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
        EmployeeCount obj = new EmployeeCount();
        obj.setNoOfEmployees(5613);
        System.out.println("No Of Employees: " + (int) obj.getNoOfEmployees());
    }

/*
------------------------------------------------------------------------------------------------------------------------

- Encapsulation simply means binding object state(fields) and behavior(methods) together.
If you are creating class, you are doing encapsulation.
- The whole idea behind encapsulation is to hide the implementation details from users.
- Wrapping data (variables) and behavior(methods) to act as a single unit


- How to make an encapsulated class
1. Make Instance variables private
2. Have getter setter methods public

- It is also known as data hiding as the member variables are private and cannot be accessed from outside class
- It is combination of data hiding and abstraction
- You can create read only and/or write only classes by providing either getter and/or setter methods

 */

}

class EmployeeCount {
    private int numOfEmployees = 0;

    public void setNoOfEmployees(int count) {
        numOfEmployees = count;
    }

    public double getNoOfEmployees() {
        return numOfEmployees;
    }
}

