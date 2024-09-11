package Chapter11_School;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PersonTest {

    @Test
    public void testThatConfirmIfPersonExists() {
        Person person = new Person();
        assertNotNull(person);
    }

    @Test
    public void testThatStorePersonsNameAddressPhoneNumberAndEmailAddress() {
        Person person = new Person("femi", "13, Alayo Street", "09025540752", "femiwire45@mail.com");
        assertEquals("femi", person.getName());
        assertEquals("13, Alayo Street", person.getAddress());
        assertEquals("09025540752", person.getPhoneNumber());

    }



}
