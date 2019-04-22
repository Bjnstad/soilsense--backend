package soilsense.backend.model;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class DayLink {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name="stationId", nullable = false)
    private Station station;

}
