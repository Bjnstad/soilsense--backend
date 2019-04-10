package soilsense.backend.controller;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import soilsense.backend.StationController;

@SpringBootTest
class StationControllerTest {

    @Autowired
    StationController sc;

    @Test
    void home() {
        //StationController sc = new StationController();
        //&assertEquals("Hello World!", sc.home());

    }
}