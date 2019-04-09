package soilsense.backend.model;

public class Coords {
    private float lat;
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
