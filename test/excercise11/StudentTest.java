package excercise11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {

    private Student student = new Student();

    @Test
    public void testThatStudentExist(){
        assertNotNull(student);
    }

    @Test
    public void testThatStudentHaveAName(){
        student.setName("Oluwafemi");
        assertEquals("Oluwafemi", student.getName());
    }

    @Test
    public void testThatStudentHaveAnAddress(){
        student.setName("Oluwafemi");
        student.setAddress("Madharat");
        assertEquals("Madharat", student.getAddress());
        assertEquals("Oluwafemi", student.getName());
    }

    @Test
    public void testThatStudenthaveAPhoneNumber(){
        student.setName("Oluwafemi");
        student.setPhoneNumber("123456789");
        student.setAddress("Madharat");
        assertEquals("123456789", student.getPhoneNumber());
        assertEquals("Oluwafemi", student.getName());
        assertEquals("Madharat", student.getAddress());

    }

    @Test
    public void testThatStudentHaveAMail(){
        student.setName("Oluwafemi");
        student.setAddress("Madharat");
        student.setPhoneNumber("123456789");
        student.mail("femi@mail.com");
        assertEquals("femi@mail.com", student.getMail());
        assertEquals("Oluwafemi", student.getName());
        assertEquals("Madharat", student.getAddress());
        assertEquals("123456789", student.getPhoneNumber());
    }

    @Test
    public void testToKnowStudentStatus(){
        student.setStatus("SENIOR");
        assertEquals("SENIOR", student.getStatus());

    }

    @Test
    public void testToThrowExceptionWhenStudentEntersInvalidStatus(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> student.setStatus("INVALID"));
        }


}
