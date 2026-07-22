package Stream.EmployeeExample;

public class Employee {
    private String name;
    private String gender;
    private String department;
    private Double salary;
    private Integer yearsWorked;


    public Employee() {
    }

    public Employee(String name, Integer yearsWorked, Double salary, String department, String gender) {
        this.name = name;
        this.yearsWorked = yearsWorked;
        this.salary = salary;
        this.department = department;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(Integer yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", yearsWorked=" + yearsWorked +
                '}';
    }
}


