package soilsense.backend.model;

import org.springframework.data.annotation.Id;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@Entity
public class Station {
    @Id
    private String name;

    @Column(nullable = false)
    private Date start;

    @Column(nullable = false)
    private Coords coords;

    @Column(nullable = false)
    private float elevation;

    @Column(nullable = false)
    private String county;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Coords getCoords() {
        return coords;
    }

    public void setCoords(Coords coords) {
        this.coords = coords;
    }

    public float getElevation() {
        return elevation;
    }

    public void setElevation(float elevation) {
        this.elevation = elevation;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }
}
