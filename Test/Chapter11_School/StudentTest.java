package Chapter11_School;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentTest {
    @Test
    public void testThatStudentExist(){
        Student student = new Student();
        assertNotNull(student);
    }

    @Test
    public void testIfStudentHaveAClassStatus(){
        Student student = new Student();

    }
}
