package oop_concepts.encapsulation;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setName("Asish");
        employee.setAddress("NY");
        employee.setSalary(10000.0);
        employee.setAge(23);
        employee.setTitle("Java Developer");

        // Calls the overridden toString() automatically
        System.out.println(employee);

        // Or display using your custom method
        //employee.displayEmployeeDetails();
    }
}