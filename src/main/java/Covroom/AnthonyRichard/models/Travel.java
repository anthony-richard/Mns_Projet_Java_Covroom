package Covroom.AnthonyRichard.models;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Inheritance(strategy = InheritanceType.JOINED)

public class Travel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;
    @ManyToMany
    private List<TravelPreference> travelPreference;
     private Integer seat_at_beginning;
     private Float start_latitude;
     private Float start_longitude;
     private Date start_time;
     private Float end_latitude;
     private Float end_longitude;
     private Date end_time;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSeat_at_beginning() {
        return seat_at_beginning;
    }

    public void setSeat_at_beginning(Integer seat_at_beginning) {
        this.seat_at_beginning = seat_at_beginning;
    }

    public Float getStart_latitude() {
        return start_latitude;
    }

    public void setStart_latitude(Float start_latitude) {
        this.start_latitude = start_latitude;
    }

    public Float getStart_longitude() {
        return start_longitude;
    }

    public void setStart_longitude(Float start_longitude) {
        this.start_longitude = start_longitude;
    }

    public Date getStart_time() {
        return start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Float getEnd_latitude() {
        return end_latitude;
    }

    public void setEnd_latitude(Float end_latitude) {
        this.end_latitude = end_latitude;
    }

    public Float getEnd_longitude() {
        return end_longitude;
    }

    public void setEnd_longitude(Float end_longitude) {
        this.end_longitude = end_longitude;
    }

    public Date getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public List<TravelPreference> getTravelPreference() {
        return travelPreference;
    }

    public void setTravelPreference(List<TravelPreference> travelPreference) {
        this.travelPreference = travelPreference;
    }
}
