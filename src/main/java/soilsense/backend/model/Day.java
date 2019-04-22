package soilsense.backend.model;

import javax.persistence.*;

@Entity
public class Day {

    @Id
    private Integer id;

    @ManyToOne
    @JoinColumn(name="station_id")
    private Station station;
}



/*
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Float moisture;

    @Column(nullable = false)
    private Float precip;
 */