package com.novi.rnh;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
public class Aisdata {
    @Id
    @GeneratedValue
    private Long id;
    private int aisnummer;
    private int course;
    private int heading;
    private String invoerder;
    private double lat;
    private double lon;
    private int schipid;
    private int speed;
    private int status;
    private String timestamp;

    @ManyToOne()
    @JsonIgnore
    private Schip schip;

    public Aisdata(int aisnummer, int course, int heading, String invoerder, double lat, double lon, int schipid, int speed, int status, String timestamp, Schip schip) {
        this.aisnummer = aisnummer;
        this.course = course;
        this.heading = heading;
        this.invoerder = invoerder;
        this.lat = lat;
        this.lon = lon;
        this.schipid = schipid;
        this.speed = speed;
        this.status = status;
        this.timestamp = timestamp;
        this.schip = schip;
    }

    public Aisdata(Long id) {
    }

    public int getAisnummer() {
        return aisnummer;
    }
    public void setAisnummer(int aisnummer) {
        this.aisnummer = aisnummer;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public int getHeading() {
        return heading;
    }
    public void setHeading(int heading) {
        this.heading = heading;
    }
    public String getInvoerder() {
        return invoerder;
    }
    public void setInvoerder(String invoerder) {
        this.invoerder = invoerder;
    }
    public double getLat() {
        return lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLon() {
        return lon;
    }
    public void setLon(double lon) {
        this.lon = lon;
    }
    public int getSchipid() {
        return schipid;
    }
    public void setSchipid(int schipid) {
        this.schipid = schipid;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
