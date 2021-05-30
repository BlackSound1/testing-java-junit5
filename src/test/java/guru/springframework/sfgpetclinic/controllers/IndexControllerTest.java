package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {
    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @Test
    void index() {
        assertEquals("index", controller.index());
//        assertEquals("inde", controller.index(), "Wrong View Returned"); // Gives helpful error
    }

    @DisplayName("Oopsie poopsie!")
    @Test
    void oupsHandler() {
        // An expensive message to call can be put into a lambda, so it is only created/ called when necessary,
        // then forgotten about
//        assertTrue("notimplemented".equals(controller.oupsHandler()),
//                () -> "This is some expensive message to build for my test");

        // Asserts than an Exception is thrown
        assertThrows(ValueNotFoundException.class, () -> {
            controller.oupsHandler();
        });
    }

    // Can make sure Tests don't take too long
    @Disabled("Disabled Timeouts")
    @Test
    void testTimeOut(){
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);
            System.out.println("I got here");
        });
    }

    @Disabled("Disabled Timeouts")
    @Test
    void testTimeOutPrempt(){
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(2000);
            System.out.println("I got here 1312313");
        });
    }
}