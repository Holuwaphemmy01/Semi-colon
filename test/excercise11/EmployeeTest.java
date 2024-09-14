package excercise11;

import org.junit.jupiter.api.Test;

import javax.xml.crypto.Data;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeTest {

    private Employee employee = new Employee();
    private Date date = new Date();

    @Test
    public void testThatEmployeeExist(){
        assertNotNull(employee);
    }

    @Test
    public void testThatEmployeeName(){
        employee.setName("Adelakun");
        assertEquals("Adelakun", employee.getName());
    }

    @Test
    public void testToKnowEmployeeMail(){
        employee.setName("Adelakun");
        employee.mail("adelakun@mail.com");
        assertEquals("Adelakun", employee.getName());
        assertEquals("adelakun@mail.com", employee.getMail());
    }

    @Test
    public void testToKnowEmployeePhone(){
        employee.setName("Adelakun");
        employee.mail("adelakun@mail.com");
        employee.setPhoneNumber("09025540752");
        assertEquals("Adelakun", employee.getName());
        assertEquals("adelakun@mail.com", employee.getMail());
        assertEquals("09025540752", employee.getPhoneNumber());
    }

    @Test
    public void testToKnowEmployeeAddress(){
        employee.setName("Adelakun");
        employee.mail("adelakun@mail.com");
        employee.setPhoneNumber("09025540752");
        employee.setAddress("sabo, yaba, Lagos");
        assertEquals("Adelakun", employee.getName());
        assertEquals("adelakun@mail.com", employee.getMail());
        assertEquals("09025540752", employee.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", employee.getAddress());
    }

    @Test
    public void testToknowEmployeeOffice() {
        employee.setName("Adelakun");
        employee.mail("adelakun@mail.com");
        employee.setPhoneNumber("09025540752");
        employee.setAddress("sabo, yaba, Lagos");
        employee.setOffice("Assistant Secretary");
        assertEquals("Adelakun", employee.getName());
        assertEquals("adelakun@mail.com", employee.getMail());
        assertEquals("09025540752", employee.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", employee.getAddress());
        assertEquals("Assistant Secretary", employee.getOffice());
    }

    @Test
    public void testForEmployeeSalary(){
        employee.setName("Adelakun");
        employee.mail("adelakun@mail.com");
        employee.setPhoneNumber("09025540752");
        employee.setAddress("sabo, yaba, Lagos");
        employee.setOffice("Assistant Secretary");
        employee.setSalary(15_000);
        assertEquals("Adelakun", employee.getName());
        assertEquals("adelakun@mail.com", employee.getMail());
        assertEquals("09025540752", employee.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", employee.getAddress());
        assertEquals("Assistant Secretary", employee.getOffice());
        assertEquals(15_000.0, employee.getSalary());
    }

    @Test
    public void testForDateEmployeeGetHired(){
        employee.setName("Adelakun");
        employee.mail("adelakun@mail.com");
        employee.setPhoneNumber("09025540752");
        employee.setAddress("sabo, yaba, Lagos");
        employee.setOffice("Assistant Secretary");
        employee.setSalary(15_000);
        assertEquals("Adelakun", employee.getName());
        assertEquals("adelakun@mail.com", employee.getMail());
        assertEquals("09025540752", employee.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", employee.getAddress());
        assertEquals("Assistant Secretary", employee.getOffice());
        assertEquals(15_000.0, employee.getSalary());
        assertEquals(date, employee.getDate());
    }




}