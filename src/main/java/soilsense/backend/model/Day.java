package soilsense.backend.model;

import javax.persistence.Column;
import java.util.Date;

public class Day {

    @Column(nullable = false)
    private Date date;

    @Column(nullable = false)
    private Float moisture;

    @Column(nullable = false)
    private Float precip;
}
