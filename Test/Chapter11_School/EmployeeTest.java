package Chapter11_School;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeTest {
    @Test
    public void testThatEmployeeExists() {
        Employee employee = new Employee();
        assertNotNull(employee);
    }

    @Test
    public void testThatEmployeeHasA_Name(){
        Employee employee = new Employee("Adeleke");
        assertEquals("Adeleke", employee.getName());
    }

    @Test
    public void testThatEmployeeHasAnOffice(){
        Employee employee = new Employee("Adeleke Adenuga");
        employee.setOffice("Secretary");
        assertEquals("Adeleke Adenuga", employee.getName());
        assertEquals("Secretary", employee.getDepartment());
    }

    @Test
    public void testThatCheckEmployeeSalary(){
        Employee employee = new Employee("Adeleke");
        employee.setOffice("Secretary");
        employee.setSalary(15_000);
        assertEquals("Secretary", employee.getDepartment());
        assertEquals(15_000, employee.getSalary());
    }


}
