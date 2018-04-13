package com.example.multilab.app2.Entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "deiktes")
public class Deiktes {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "AKSONES_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Aksones aksonas;

    @Column(name = "STADIO")
    private Integer stadio;

    @ManyToMany(mappedBy = "deiktesList")
    private List<Dhmos> dhmosList = new ArrayList<>();

    public Deiktes(){}

    public Deiktes(String name, Aksones aksonas, Integer stadio) {
        this.name = name;
        this.aksonas = aksonas;
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

    public Aksones getAksonas() {
        return aksonas;
    }

    public void setAksonas(Aksones aksonas) {
        this.aksonas = aksonas;
    }

    public Integer getStadio() {
        return stadio;
    }

    public void setStadio(Integer stadio) {
        this.stadio = stadio;
    }

    public List<Dhmos> getDhmosList() {  return dhmosList; }

    public void setDhmosList(List<Dhmos> dhmosList) {  this.dhmosList = dhmosList; }
}
