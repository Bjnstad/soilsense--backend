package soilsense.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Coords {

    @Column(nullable = false)
    private float lat;

    @Column(nullable = false)
    private float lng;

    public Coords(float lat, float lng) {
        this.lat = lat;
        this.lng = lng;
    }

    public float getLat() {
        return lat;
    }

    public float getLng() {
        return lng;
    }
}
