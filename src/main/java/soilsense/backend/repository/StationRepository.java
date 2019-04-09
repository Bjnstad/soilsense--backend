package soilsense.backend.repository;

import org.springframework.data.repository.CrudRepository;

import soilsense.backend.model.Station;

public interface StationRepository extends CrudRepository<Station, String> {

}
