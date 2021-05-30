package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

    @Test
    void oupsHandler() {
        // An expensive message to call can be put into a lambda, so it is only created/ called when necessary,
        // then forgotten about
        assertTrue("notimplemented".equals(controller.oupsHandler()),
                () -> "This is some expensive message to build for my test");
    }
}