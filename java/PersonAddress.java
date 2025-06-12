package basic;
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    void displayEmployee() {
        displayPerson();
        System.out.println("Salary: " + salary);
    }
}

public class PersonAddress{
    public static void main(String[] args) {
        Employee emp = new Employee("John", 25, 40000);
        emp.displayEmployee();
    }
}
