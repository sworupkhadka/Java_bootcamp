package collection.List;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    private String name;
    private String address;
    private double salary;
    private int age;

    // Parameterized constructor
    public EmployeeList(String name, String address, double salary, int age) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {

        List<EmployeeList> employeeList = new ArrayList<>();

        employeeList.add(new EmployeeList("Anish", "NJ", 10000.0, 28));


        for (EmployeeList employee : employeeList) {
            System.out.println(employee);
        }
    }
}