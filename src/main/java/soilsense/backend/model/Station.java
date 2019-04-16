package soilsense.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Entity
public class Station implements Serializable {


    @Id
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Float lat;

    @Column(nullable = false)
    private Float lng;

    @OneToMany(mappedBy = "station", cascade = CascadeType.REMOVE)
    private Set<Day> days;

    public Station(Integer id, String name, Float lat, Float lng, Day... days) {
        this.id = id;
        this.name = name;
        this.lat = lat;
        this.lng = lng;
        this.days = Stream.of(days).collect(Collectors.toSet());
        //this.days.forEach(x -> x.setDay(this));
    }
}


