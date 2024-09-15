package Chapter11_School;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FacultyMemberTest {

    @Test
    public void testThatFacultyMemberExist(){
        FacultyMember facultyMember = new FacultyMember();
        assertNotNull(facultyMember);
    }

    @Test
    public void testThatFacultyMemberHaveAName(){
        FacultyMember facultyMember = new FacultyMember();
        facultyMember.setName("femi");
        assertEquals("femi", facultyMember.getName());
    }

    @Test
    public void testThatFacultyMemberHaveAMail(){
        FacultyMember facultyMember = new FacultyMember();
        facultyMember.setMail("femi@gmail.com");
        assertEquals("femi@gmail.com", facultyMember.getMail());

    }

    @Test
    public void testThatFacultyMemberHaveAPhone(){
        FacultyMember facultyMember = new FacultyMember();
        facultyMember.setPhoneNumber("09025540752");
        assertEquals("09025540752", facultyMember.getPhoneNumber());
    }

    @Test
    public void testThatFacultyMemberHaveAnAddress(){
        FacultyMember facultyMember = new FacultyMember();
        facultyMember.setAddress("some address");
        assertEquals("some address", facultyMember.getAddress());
    }

    @Test
    public void testThatFacultyMembersWorkHours(){
        FacultyMember facultyMember = new FacultyMember();
        facultyMember.setWorkHours("9-5");
        assertEquals("9-5", facultyMember.getWorkHours());
    }

    @Test
    public void testThatToKnowTheFacultyMemberRank(){
        FacultyMember facultyMember = new FacultyMember();
        facultyMember.setRank("Head Of Recruitment");
        assertEquals("Head Of Recruitment", facultyMember.getRank());
    }

}
