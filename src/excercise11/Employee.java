package excercise11;

import java.util.Date;

public class Employee extends Person {

    public Employee() {
        Date dateHired = new Date();
    }


    private Date dateHired = new Date();
    private String office;
    private double salary;

    public void setOffice(String office) {
        this.office = office;
    }
    public String getOffice() {
        return office;
    }

    public void setSalary(double amount) {
        this.salary = amount;
    }
    public double getSalary() {
        return salary;
    }
    public Date getDate(){
        return dateHired;
    }
}
