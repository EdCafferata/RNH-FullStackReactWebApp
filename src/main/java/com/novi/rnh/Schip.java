package com.novi.rnh;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder(toBuilder = true)
@AllArgsConstructor(access = AccessLevel.PACKAGE)
@NoArgsConstructor(access = AccessLevel.PACKAGE)
@Setter(value = AccessLevel.PACKAGE)
@Getter
@SequenceGenerator(name = "bootCounter")
public class Schip {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bootCounter")
    private Long id;
    private int aisnummer;
    private String klasse;
    private String naamschip;
    private String naamschipper;
    private String scheepstype;
    private double swrating;

    @OneToMany(mappedBy = "schip")
    @JsonIgnore
    private List<Aisdata> aisdatas;

    public Schip(int aisnummer, String klasse, String naamschip, String naamschipper, String scheepstype, double swrating) {
        this.aisnummer = aisnummer;
        this.klasse = klasse;
        this.naamschip = naamschip;
        this.naamschipper = naamschipper;
        this.scheepstype = scheepstype;
        this.swrating = swrating;
    }

    public Schip(Long id) {
    }

    public int getAisnummer() {
        return aisnummer;
    }
    public void setAisnummer(int aisnummer) {
        this.aisnummer = aisnummer;
    }
    public String getKlasse() {
        return klasse;
    }
    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }
    public String getNaamschip() {
        return naamschip;
    }
    public void setNaamschip(String naamschip) {
        this.naamschip = naamschip;
    }
    public String getNaamschipper() {
        return naamschipper;
    }
    public void setNaamschipper(String naamschipper) {
        this.naamschipper = naamschipper;
    }
    public String getScheepstype() {
        return scheepstype;
    }
    public void setScheepstype(String scheepstype) {
        this.scheepstype = scheepstype;
    }
    public double getSwrating() {
        return swrating;
    }
    public void setSwrating(double swrating) {
        this.swrating = swrating;
    }
}
