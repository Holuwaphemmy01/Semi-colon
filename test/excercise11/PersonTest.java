package excercise11;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonTest {

    private Person person = new Person();

    @Test
    public void testThatClassPersonExist(){
        assertNotNull(person);
    }

    @Test
    public void testThatPersonHaveName(){
        person.setName("Oluwafemi");
        assertEquals("Oluwafemi", person.getName());
    }

    @Test
    public void testThatPersonHaveAddress(){
        person.setName("Oluwafemi");
        assertEquals("Oluwafemi", person.getName());
        person.setAddress("sabo, yaba, Lagos");
        assertEquals("sabo, yaba, Lagos", person.getAddress());
    }

    @Test
    public void testThatPersonHavePhone(){
        person.setName("Oluwafemi");
        person.setAddress("sabo, yaba, Lagos");
        person.setPhoneNumber("09025540752");
        assertEquals("Oluwafemi", person.getName());
        assertEquals("sabo, yaba, Lagos", person.getAddress());
        assertEquals("09025540752", person.getPhoneNumber());
    }

    @Test
    public void testThatPersonHaveEmail(){
        person.setName("Oluwafemi");
        person.setAddress("sabo, yaba, Lagos");
        person.setPhoneNumber("09025540752");
        person.mail("femi@mail.com");
        assertEquals("Oluwafemi", person.getName());
        assertEquals("sabo, yaba, Lagos", person.getAddress());
        assertEquals("09025540752", person.getPhoneNumber());
        assertEquals("femi@mail.com", person.getMail());
    }
}
