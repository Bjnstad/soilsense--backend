package soilsense.backend.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Station implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Id
    @Column(nullable = false)
    private Integer tick;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Float lat;

    @Column(nullable = false)
    private Float lng;

    @OneToMany(mappedBy = "station", fetch=FetchType.LAZY)
    private List<Day> days;

}


