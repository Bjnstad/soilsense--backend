package soilsense.backend;

import org.springframework.web.bind.annotation.*;
import soilsense.backend.model.Day;
import soilsense.backend.repository.DayRepository;

import java.util.List;

@RestController
@RequestMapping("/day")
public class DayController {

    private DayRepository dayRepository;

    public DayController(DayRepository dayRepository) {
        this.dayRepository = dayRepository;
    }

    /**
     * @param day
     * @return
     */
    @PostMapping
    public Day addDay(@RequestBody Day day) {
        dayRepository.save(day);
        return day;
    }

    /**
     * Get all days from a station
     * @param id Station id.
     * @return List of days.
     */
    @GetMapping("/{id}")
    public List<Day> getStation(@PathVariable Integer id ) {
        return dayRepository.getAllByStation_Id(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStation(@PathVariable Integer id ) {
        dayRepository.deleteById(id);
    }
}