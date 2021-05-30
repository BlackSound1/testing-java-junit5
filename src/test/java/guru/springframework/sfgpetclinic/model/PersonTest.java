package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    // Can create an Assertion with multiple Assertions in it
    @Test
    void groupedAssertions() {
        //given
        Person person = new Person(1L,"Joe","Buck");

        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName()),
                () -> assertEquals("Buck", person.getLastName()));
    }

    @Test
    void groupedAssertionsWithMessages() {
        //given
        Person person = new Person(1L,"Joe","Buck");

        //then
        assertAll("Test Props Set",
                () -> assertEquals("Joe", person.getFirstName(), "Wrong first name"),
                () -> assertEquals("Buck", person.getLastName(), "Wrong last name"));
    }
}