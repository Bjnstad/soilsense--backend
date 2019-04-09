package soilsense.backend.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StationControllerTest {

    @Autowired
    StationController sc;

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void home() {
        StationController sc = new StationController();
        //&assertEquals("Hello World!", sc.home());

    }
}