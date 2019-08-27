package soilsense.backend;

import org.springframework.web.bind.annotation.*;
import soilsense.backend.model.Station;
import soilsense.backend.repository.StationRepository;
import java.util.List;

@RestController
@RequestMapping("/station")
public class StationController {

    private StationRepository stationRepository;

    public StationController(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }


    @GetMapping
    public List<Station> getStation() {
        return stationRepository.findAll();
    }

    @PostMapping
    public Station addStation(@RequestBody Station station) {
        stationRepository.save(station);
        return station;
    }

    @DeleteMapping("/{id}")
    public void deleteStation(@PathVariable Integer id ) {
        stationRepository.deleteById(id);
    }
}