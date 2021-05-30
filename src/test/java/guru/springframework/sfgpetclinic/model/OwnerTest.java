package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
    @Test
    void dependantAssertions(){
        Owner owner = new Owner(1L,"Joe","Buck");
        owner.setCity("Key West");
        owner.setTelephone("1231231234");

        // Can have Assertions within Assertions
        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Joe", owner.getFirstName(), "Wrong first name"),
                        () -> assertEquals("Buck", owner.getLastName(), "Wrong last name")),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West", owner.getCity(), "Wrong city"),
                        () -> assertEquals("1231231234", owner.getTelephone(), "Wrong phone"))
                );
    }

}