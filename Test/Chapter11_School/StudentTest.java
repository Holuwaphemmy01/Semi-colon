package Chapter11_School;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentTest {
    @Test
    public void testThatStudentExist(){
        Student student = new Student();
        assertNotNull(student);
    }

    @Test
    public void thatStudentHaveAName(){
        Student student = new Student("Jacob Oluwafemi");
        assertEquals("Jacob Oluwafemi", student.getName());
    }

    @Test
    public void thatStudentHaveANAmeAndEmail(){
        Student student = new Student("Jacob Oluwafemi", "femi@mail.com");
        assertEquals("Jacob Oluwafemi", student.getName());
        assertEquals("femi@mail.com", student.getMail());
    }

    @Test
    public void testThatStudentHaveAName_EmailAndAddress(){
        Student student = new Student("Jacob Oluwafemi", "femi@mail.com", "13, alayo street");
        assertEquals("Jacob Oluwafemi", student.getName());
        assertEquals("femi@mail.com", student.getMail());
        assertEquals("13, alayo street", student.getAddress());
    }

    @Test
    public void testThatStudentHaveName_Email_AddressAndNumber(){
        Student student = new Student("Jacob Oluwafemi", "femi@mail.com", "13, alayo street", "09025540752");
        assertEquals("Jacob Oluwafemi", student.getName());
        assertEquals("femi@mail.com", student.getMail());
        assertEquals("13, alayo street", student.getAddress());
        assertEquals("09025540752", student.getPhoneNumber());
    }

    @Test
    public void testIfStudentHaveAClassStatus(){
        Student student = new Student("Jacob Oluwafemi", "femi@mail", "13, sabo street", "09025540752", ClassStatus.SENIOR);
        assertEquals("Jacob Oluwafemi", student.getName());
        assertEquals("femi@mail", student.getMail());
        assertEquals("13, sabo street", student.getAddress());
        assertEquals("09025540752", student.getPhoneNumber());
        assertEquals(ClassStatus.SENIOR, student.getStatus());
    }



}
