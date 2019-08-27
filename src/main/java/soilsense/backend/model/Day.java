package soilsense.backend.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class Day {

    @Id
    @GeneratedValue
    private Integer id;

    private Integer stationId;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Float moisture;

    @Column(nullable = false)
    private Float precip;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStationId() {
        return stationId;
    }

    public void setStationId(Integer stationId) {
        this.stationId = stationId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Float getMoisture() {
        return moisture;
    }

    public void setMoisture(Float moisture) {
        this.moisture = moisture;
    }

    public Float getPrecip() {
        return precip;
    }

    public void setPrecip(Float precip) {
        this.precip = precip;
    }
}
