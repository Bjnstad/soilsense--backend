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
















    // Get all stations - add to list

    /*
    @GetMapping("/")
    public List<Station> getAllStations(){
        List<Station> list = new ArrayList<>();
        stationRepository.findAll().forEach(list::add);
        return list;
    }


    // add stations with coords
    @PostMapping(value = "/", produces = "application/json")
    public Station addStation(@RequestBody Station station) {
        stationRepository.save(station);
        return station;
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public Station getStation(@PathVariable Integer id) {
        return stationRepository.findById(id).get();
    }

    @ExceptionHandler
    void handleIllegalArgumentException(IllegalArgumentException e, HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }
     */
}