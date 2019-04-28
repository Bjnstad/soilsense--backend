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
     * @param days
     * @return
     */
    @PostMapping
    public boolean addDay(@RequestBody List<Day> days) {
        for(Day day : days) dayRepository.save(day);
        return true;
    }

    @GetMapping("/{id}")
    public List<Day> getDays(@PathVariable Integer id) {
        return dayRepository.getAllByStationId(id);
    }


    @DeleteMapping("/{id}")
    public void deleteStation(@PathVariable Integer id ) {
        dayRepository.deleteById(id);
    }
}