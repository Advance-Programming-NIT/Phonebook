import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Phonebook_Test {
    @Test
    public void testAddContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John Doe", "09123456789");
        phonebook.addContact(person);
        assertEquals(1, phonebook.getAllContacts().size());
        assertEquals(person, phonebook.getAllContacts().get(0));
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

    @Test
    public void testUpdateContactName() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John Doe", "09123456789");
        phonebook.addContact(person);
        assertEquals(1, phonebook.updateContactName("John Doe", "Jane Doe"));
        assertEquals("Jane Doe", phonebook.getAllContacts().get(0).getName());
    }

    @Test
    public void testUpdateContactPhoneNumber() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John Doe", "09123456789");
        phonebook.addContact(person);
        assertEquals(1, phonebook.updateContactPhoneNumber("John Doe", "09123456788"));
        assertEquals("09123456788", phonebook.getAllContacts().get(0).getPhone());
    }

    @Test
    public void testDeleteContact() {
        Phonebook phonebook = new Phonebook();
        Person person = new Person("John Doe", "09123456789");
        phonebook.addContact(person);
        assertEquals(1, phonebook.deleteContact("John Doe"));
        assertEquals(0, phonebook.getAllContacts().size());
    }

    @Test
    public void testSetAllContactsHidden() {
        Phonebook phonebook = new Phonebook();
        Person person1 = new Person("John Doe", "09123456789");
        Person person2 = new Person("Jane Doe", "09123456788");
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        phonebook.setAllContactsHidden();
        assertTrue(phonebook.getAllContacts().get(0).isHidden());
        assertTrue(phonebook.getAllContacts().get(1).isHidden());
    }

    @Test
    public void testSetAllContactsUnHidden() {
        Phonebook phonebook = new Phonebook();
        Person person1 = new Person("John Doe", "09123456789");
        Person person2 = new Person("Jane Doe", "09123456788");
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        phonebook.setAllContactsHidden();
        phonebook.setAllContactsUnHidden();
        assertFalse(phonebook.getAllContacts().get(0).isHidden());
        assertFalse(phonebook.getAllContacts().get(1).isHidden());
    }
}
