package excercise11;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StaffTest {

    private Staff staff = new Staff();
    private Date date = new Date();

    @Test
    public void testThatStaffClassExist(){
        assertNotNull(staff);
    }

    @Test
    public void testThatStaffHaveAName(){
        staff.setName("Oluwafemi");
        assertEquals("Oluwafemi", staff.getName());
    }

    @Test
    public void testThatStaffHaveAnAddress(){
        staff.setName("Oluwafemi");
        staff.setAddress("yaba, Lagos");
        assertEquals("Oluwafemi", staff.getName());
        assertEquals("yaba, Lagos", staff.getAddress());
    }

    @Test
    public void testThatStaffHaveAnEmail(){
        staff.setName("Oluwafemi");
        staff.setAddress("yaba, Lagos");
        staff.mail("femi@mail.com");
        assertEquals("Oluwafemi", staff.getName());
        assertEquals("yaba, Lagos", staff.getAddress());
        assertEquals("femi@mail.com", staff.getMail());
    }

    @Test
    public void testThatStaffHaveAnPhone(){
        staff.setName("Oluwafemi");
        staff.setAddress("yaba, Lagos");
        staff.mail("femi@mail.com");
        staff.setPhoneNumber("09025540752");
        assertEquals("Oluwafemi", staff.getName());
        assertEquals("yaba, Lagos", staff.getAddress());
        assertEquals("femi@mail.com", staff.getMail());
        assertEquals("09025540752", staff.getPhoneNumber());
    }

    @Test
    public void testThatStaffHaveADepartment(){
        staff.setName("Oluwafemi");
        staff.setAddress("yaba, Lagos");
        staff.mail("femi@mail.com");
        staff.setPhoneNumber("09025540752");
        staff.setOffice("Secretary");
        assertEquals("Oluwafemi", staff.getName());
        assertEquals("yaba, Lagos", staff.getAddress());
        assertEquals("femi@mail.com", staff.getMail());
        assertEquals("09025540752", staff.getPhoneNumber());
        assertEquals("Secretary", staff.getOffice());
    }

    @Test
    public void testForStaffSalary(){
        staff.setName("Oluwafemi");
        staff.setAddress("yaba, Lagos");
        staff.mail("femi@mail.com");
        staff.setPhoneNumber("09025540752");
        staff.setOffice("Secretary");
        staff.setSalary(500);
        assertEquals("Oluwafemi", staff.getName());
        assertEquals("yaba, Lagos", staff.getAddress());
        assertEquals("femi@mail.com", staff.getMail());
        assertEquals("09025540752", staff.getPhoneNumber());
        assertEquals("Secretary", staff.getOffice());
        assertEquals(500, staff.getSalary());
    }

    @Test
    public void testForStaffHiredDate(){
        staff.setName("Oluwafemi");
        staff.setAddress("yaba, Lagos");
        staff.mail("femi@mail.com");
        staff.setPhoneNumber("09025540752");
        staff.setOffice("Secretary");
        staff.setSalary(500);
        assertEquals(date, staff.getDate());
        assertEquals("Oluwafemi", staff.getName());
        assertEquals("yaba, Lagos", staff.getAddress());
        assertEquals("femi@mail.com", staff.getMail());
        assertEquals("09025540752", staff.getPhoneNumber());
        assertEquals("Secretary", staff.getOffice());
        assertEquals(500, staff.getSalary());
    }

    @Test
    public void testForStaffTitle(){
        staff.setName("Oluwafemi");
        staff.setAddress("yaba, Lagos");
        staff.mail("femi@mail.com");
        staff.setPhoneNumber("09025540752");
        staff.setOffice("Secretary");
        staff.setSalary(500);
        staff.setTitle("junior");
        assertEquals("Oluwafemi", staff.getName());
        assertEquals("yaba, Lagos", staff.getAddress());
        assertEquals("femi@mail.com", staff.getMail());
        assertEquals("09025540752", staff.getPhoneNumber());
        assertEquals("Secretary", staff.getOffice());
        assertEquals(500, staff.getSalary());
        assertEquals(date, staff.getDate());
        assertEquals("junior", staff.getTitle());
    }

}
