package Chapter11_School;

public class Employee extends Person {
    String department;
    private Double salary;
    private java.util.Date hireDate;

    public Employee() {
        hireDate = new java.util.Date();
    }

    public Employee(String name) {
        super(name);
    }



    public void setOffice(String office) {
        department = office;
    }
    public String getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
