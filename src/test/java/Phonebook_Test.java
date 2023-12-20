/**
 * writing unit tests for each method of classes
 * If you have no idea about how to write unit tests, you can search the internet or check your first assignment
 * After each unit test you've written, please commit the changes and push to your repo

 * Hint: Your test coverage should be 100%
 * Attention:  We would check your commits and it will affect your score
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class Phonebook_Test {
    @Test
    public void testConstructor() {
        Person person = new Person("John Doe", "09123456789");
        assertEquals("John Doe", person.getName());
        assertEquals("09123456789", person.getPhone());
        assertFalse(person.isHidden());
    }

    @Test
    public void testGetName() {
        Person person = new Person("John Doe", "09123456789");
        assertEquals("John Doe", person.getName());
    }

    @Test
    public void testGetPhone() {
        Person person = new Person("John Doe", "09123456789");
        assertEquals("09123456789", person.getPhone());
    }

    @Test
    public void testGetId() {
        Person person = new Person("John Doe", "09123456789");
        assertEquals(1, person.getId());
    }

    @Test
    public void testIsHidden() {
        Person person = new Person("John Doe", "09123456789");
        assertFalse(person.isHidden());
    }

    @Test
    public void testSetName() {
        Person person = new Person("John Doe", "09123456789");
        person.setName("Jane Doe");
        assertEquals("Jane Doe", person.getName());
    }

    @Test
    public void testSetPhone() {
        Person person = new Person("John Doe", "09123456789");
        person.setPhone("09234567891");
        assertEquals("09234567891", person.getPhone());

    }
    @Test
    public void testSetHidden() {
        Person person = new Person("John Doe", "09123456789");
        person.setHidden();
        assertTrue(person.isHidden());
    }
    @Test
    public void testSetUnHidden() {
        Person person = new Person("John Doe", "09123456789");
        person.setHidden();
        person.setUnHidden();
        assertFalse(person.isHidden());
    }
    @Test
    public void testToString() {
        Person person   = new Person("John Doe", "09123456789");
        assertEquals("Name: John Doe - Phone number: 09123456789", person.toString());
    }
    @Test
    public void testAddContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John Doe", "09123456789");
        phonebook.addContact(person);
        assertTrue(phonebook.getAllContacts().contains(person));
    }
    @Test
    public void testGetPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John Doe", "09123456789");
        phonebook.addContact(person);
        assertEquals("09123456789", phonebook.getPhoneNumber("John Doe"));
    }
    @Test
    public void testGetContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John Doe", "09123456789");
        phonebook.addContact(person);
        assertEquals(1, phonebook.getContact("John Doe"));
    }
}

