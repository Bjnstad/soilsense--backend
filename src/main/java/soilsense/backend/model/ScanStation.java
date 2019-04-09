package soilsense.backend.model;

import java.util.Date;

public class ScanStation {
    private String name;
    private Date start;
    private Coords coords;
    private float elevation;
    private String county;

    public ScanStation(String name, Date start, Coords coords, float elevation, String county) {
        this.name = name;
        this.start = start;
        this.coords = coords;
        this.elevation = elevation;
        this.county = county;
    }

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
