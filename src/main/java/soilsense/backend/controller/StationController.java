package soilsense.backend.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import soilsense.backend.repository.StationRepository;

@RestController
public class StationController {

    StationRepository stationRepository;

    @RequestMapping("/station")
    String station() {
        // return stationRepository.findById(id).get();
        return "Hello from station!";
    }
}