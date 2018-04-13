package com.example.multilab.app2.dto;

import com.example.multilab.app2.Entities.DhmosDeiktes;

public class DhmosDeiktesDto {

    private Long id;

    private Long deiktes_id;

    private Long dhmos_id;

    private Long stadio;

    public DhmosDeiktesDto(DhmosDeiktes dhmosDeiktes){
        this.id = dhmosDeiktes.getId();
        this.dhmos_id = dhmosDeiktes.getDhmos_id();
        this.deiktes_id = dhmosDeiktes.getDeiktes_id();
        this.stadio = dhmosDeiktes.getStadio();
    }

    public DhmosDeiktesDto(){}

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
