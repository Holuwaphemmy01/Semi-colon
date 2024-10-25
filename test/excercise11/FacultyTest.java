package excercise11;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FacultyTest{

    private Faculty faculty = new Faculty();
    private Date date = new Date();

    @Test
    public void testThatFacultyEmployeeExist(){
        assertNotNull("faculty");
    }

    @Test
    public void testThatFacultyMemberHaveAName(){
        faculty.setName("Oluwafemi");
        assertEquals("Oluwafemi", faculty.getName());
    }

    @Test
    public void testThatFacultyMemberHaveAMail(){
        faculty.setName("Oluwafemi");
        faculty.mail("femi@mail.com");
        assertEquals("Oluwafemi", faculty.getName());
        assertEquals("femi@mail.com", faculty.getMail());
    }

    @Test
    public void testThatFacultyMemberHaveAPhone(){
        faculty.setName("Oluwafemi");
        faculty.mail("femi@mail.com");
        faculty.setPhoneNumber("09025540752");
        assertEquals("Oluwafemi", faculty.getName());
        assertEquals("femi@mail.com", faculty.getMail());
        assertEquals("09025540752", faculty.getPhoneNumber());
    }

    @Test
    public void testToKnowFacultyMemberAddress(){
        faculty.setName("Oluwafemi");
        faculty.mail("femi@mail.com");
        faculty.setPhoneNumber("09025540752");
        faculty.setAddress("sabo, yaba, Lagos");
        assertEquals("Oluwafemi", faculty.getName());
        assertEquals("femi@mail.com", faculty.getMail());
        assertEquals("09025540752", faculty.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", faculty.getAddress());
    }

    @Test
    public void testThatFacultyMemberHaveOffice(){
        faculty.setName("Oluwafemi");
        faculty.mail("femi@mail.com");
        faculty.setPhoneNumber("09025540752");
        faculty.setAddress("sabo, yaba, Lagos");
        faculty.setOffice("Assistant Secretary");
        assertEquals("Oluwafemi", faculty.getName());
        assertEquals("femi@mail.com", faculty.getMail());
        assertEquals("09025540752", faculty.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", faculty.getAddress());
        assertEquals("Assistant Secretary", faculty.getOffice());
    }


    @Test
    public void testForFacultyMemberSalary(){
        faculty.setName("Oluwafemi");
        faculty.mail("femi@mail.com");
        faculty.setPhoneNumber("09025540752");
        faculty.setAddress("sabo, yaba, Lagos");
        faculty.setOffice("Assistant Secretary");
        faculty.setSalary(20_000);
        assertEquals("Oluwafemi", faculty.getName());
        assertEquals("femi@mail.com", faculty.getMail());
        assertEquals("09025540752", faculty.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", faculty.getAddress());
        assertEquals("Assistant Secretary", faculty.getOffice());
        assertEquals(20_000, faculty.getSalary());
    }

    @Test
    public void testForDateWhichFacultyMemberWasHired(){
        faculty.setName("Oluwafemi");
        faculty.mail("femi@mail.com");
        faculty.setPhoneNumber("09025540752");
        faculty.setAddress("sabo, yaba, Lagos");
        faculty.setOffice("Assistant Secretary");
        faculty.setSalary(20_000);
        assertEquals(date, faculty.getDate());
        assertEquals("Oluwafemi", faculty.getName());
        assertEquals("femi@mail.com", faculty.getMail());
        assertEquals("09025540752", faculty.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", faculty.getAddress());
        assertEquals("Assistant Secretary", faculty.getOffice());
        assertEquals(20_000, faculty.getSalary());

    }

    @Test
    public void testForFacultyMemberOfficeHours(){
        faculty.setName("Oluwafemi");
        faculty.mail("femi@mail.com");
        faculty.setPhoneNumber("09025540752");
        faculty.setAddress("sabo, yaba, Lagos");
        faculty.setOffice("Assistant Secretary");
        faculty.setSalary(20_000);
        faculty.setOfficeHour("8am", "4pm");
        assertEquals("Oluwafemi", faculty.getName());
        assertEquals("femi@mail.com", faculty.getMail());
        assertEquals("09025540752", faculty.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", faculty.getAddress());
        assertEquals("Assistant Secretary", faculty.getOffice());
        assertEquals(20_000, faculty.getSalary());
        assertEquals("8am to 4pm", faculty.getOfficeHour());
    }

    @Test
    public void testForFacultyMemberRank(){
        faculty.setName("Oluwafemi");
        faculty.mail("femi@mail.com");
        faculty.setPhoneNumber("09025540752");
        faculty.setAddress("sabo, yaba, Lagos");
        faculty.setOffice("Assistant Secretary");
        faculty.setSalary(20_000);
        faculty.setOfficeHour("8am", "4pm");
        faculty.setRank("3 Star");
        assertEquals("Oluwafemi", faculty.getName());
        assertEquals("femi@mail.com", faculty.getMail());
        assertEquals("09025540752", faculty.getPhoneNumber());
        assertEquals("sabo, yaba, Lagos", faculty.getAddress());
        assertEquals("Assistant Secretary", faculty.getOffice());
        assertEquals(20_000, faculty.getSalary());
        assertEquals("8am to 4pm", faculty.getOfficeHour());
        assertEquals("3 Star", faculty.getRank());
    }


}
