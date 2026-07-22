package Stream.EmployeeExample;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStream {

    //Using stream in large datasets

    static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Anup",4,5000d,"Engineering","Male"),
                new Employee("kushal",12,7000d,"HR","Male"),
                new Employee("bigyan",1,51300d,"HR","Female"),
                new Employee("hari",7,1000d,"R&D","Female"),
                new Employee("yuro",18,89000d,"Marketing","Female")
        );

        //max salary from hr dept
        System.out.println(employees.stream()
                        .filter(employee -> employee.getDepartment().equalsIgnoreCase("hr"))
                        .max(Comparator.comparing(Employee::getSalary))
                        .get());






        //group employees by gender
//        employees.stream()
//                        .collect(Collectors.groupingBy(Employee::getGender))
//                                .forEach((gender,emps) -> {
//                                            System.out.println(gender);
//                                            emps.stream()
//                                                    .forEach(System.out::println);
//                                        });

        //to update salary of ones working more than 6 years by 20%
//        employees.stream()
//                .filter (emp -> emp.getYearsWorked() >6)
//                .map(emp ->{
//                    emp.setSalary(emp.getSalary()*1.2);
//                    return emp;
//                        })
//                .forEach(System.out::println);
//
//        System.out.println("-------------");                //to check updated or not
//        employees.stream()
//                .forEach(System.out::println);

//        //calculate bonus for ones work more then 5 years
//        employees.stream()
//                .filter(employee -> employee.getYearsWorked()>5)
//                .map(employee -> employee.getSalary() * 1.1)                        //10 percent
//                .forEach(System.out::println);



        //all female employees
//        employees.stream()
//                .filter(emp -> emp.getGender().equalsIgnoreCase("Female"))
//                .forEach(System.out::println);


//        employees.stream()
//                .sorted(Comparator.comparing(Employee::getYearsWorked))
//                .forEach(System.out::println);

        //in ascending order for descending order use ::getYearsWorked, Comparator.reverseOrder()


        //employee with max salary

        //Class_name :: method_name   is  Method reference (shorthand notation) for referring to methods or constructor of classes.

//        System.out.println(employees.stream()
//                .max(Comparator.comparing(Employee :: getSalary))    //calls method employee ko getSalary
//                .get());


//        employees.stream()
//                .filter(emp -> emp.getSalary()>5000)
//                .forEach(emp -> System.out.println(emp));


        /*
        filtering out ones who work in HR
        employees.stream()
                .filter(emp -> emp.getDepartment().equals("HR"))
                .forEach(emp-> System.out.println(emp));            or just use .forEach(System.out::println) if only one parameter
         */

    }
}
