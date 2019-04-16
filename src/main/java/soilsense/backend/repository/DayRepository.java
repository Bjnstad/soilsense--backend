package soilsense.backend.repository;

        import org.springframework.data.jpa.repository.JpaRepository;
        import soilsense.backend.model.Day;

        import java.util.List;

public interface DayRepository extends JpaRepository<Day, Integer> {
    List<Day> getAllByStation_Id(Integer id);
}
