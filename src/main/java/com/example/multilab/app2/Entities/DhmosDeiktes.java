package com.example.multilab.app2.Entities;

import javax.persistence.*;

@Entity
@Table(name = "dhmos_deiktes")
public class DhmosDeiktes {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "DEIKTES_ID")
    private Long deiktes_id;

    @Column(name = "DHMOS_ID")
    private Long dhmos_id;

    @Column(name = "STADIO")
    private Long stadio;

    public DhmosDeiktes(Dhmos dhmos,Deiktes deiktes){
        this.dhmos_id = dhmos.getId();
        this.deiktes_id = deiktes.getId();
        this.stadio = 0L;
    }

    public DhmosDeiktes(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeiktes_id() {
        return deiktes_id;
    }

    public void setDeiktes_id(Long deiktes_id) {
        this.deiktes_id = deiktes_id;
    }

    public Long getDhmos_id() {
        return dhmos_id;
    }

    public void setDhmos_id(Long dhmos_id) {
        this.dhmos_id = dhmos_id;
    }

    public Long getStadio() {
        return stadio;
    }

    public void setStadio(Long stadio) {
        this.stadio = stadio;
    }
}
