package soilsense.backend.controller;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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