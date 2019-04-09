package soilsense.backend.controller;
import org.springframework.boot.*;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import soilsense.backend.model.Station;
import soilsense.backend.repository.StationRepository;

import java.util.Optional;

@Controller
public class StationController {

    private StationRepository stationRepository;

    @GetMapping(path="/station")
    public @ResponseBody Station getStation(@RequestParam String id) {
        return stationRepository.findById(id).get();
    }

    public static void main(String[] args) {
        SpringApplication.run(StationController.class, args);
    }

}
