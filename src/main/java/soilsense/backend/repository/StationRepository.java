package soilsense.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soilsense.backend.model.Station;

public interface StationRepository extends JpaRepository<Station, Integer> {

}
