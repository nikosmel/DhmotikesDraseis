package com.example.multilab.app2.Entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "arxes")
public class Arxes {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SUBNAME")
    private String subname;

    @Column(name = "APOTELESMA")
    private String apotelesma;

    @Column(name = "STADIO_APOTELESMATOS")
    private Integer stadio;

    @OneToMany(mappedBy = "arxh", fetch = FetchType.LAZY)
    private List<Aksones> aksones;

    public Arxes(){}

    public Arxes(String name, String subname, String apotelesma, Integer stadio) {
        this.name = name;
        this.subname = subname;
        this.apotelesma = apotelesma;
        this.stadio = stadio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getApotelesma() {
        return apotelesma;
    }

    public void setApotelesma(String apotelesma) {
        this.apotelesma = apotelesma;
    }

    public Integer getStadio() {
        return stadio;
    }

    public void setStadio(Integer stadio) {
        this.stadio = stadio;
    }

    public List<Aksones> getAksones() {  return aksones;  }

    public void setAksones(List<Aksones> aksones) { this.aksones = aksones;  }
}
