package com.example.multilab.app2.dto;

import com.example.multilab.app2.Entities.Deiktes;

public class DeiktesDto {

    private Long id;

    private String name;

    private AksonesDto aksonesDto;

    private Integer stadio;

    public DeiktesDto(){}

    public DeiktesDto(Deiktes deiktes){
        this.id = deiktes.getId();
        this.name = deiktes.getName();
        this.stadio = deiktes.getStadio();
    }

    public Long getId() {  return id; }

    public void setId(Long id) {  this.id = id;  }

    public String getName() {  return name;  }

    public void setName(String name) {  this.name = name; }

    public AksonesDto getAksonesDto() { return aksonesDto; }

    public void setAksonesDto(AksonesDto aksonesDto) { this.aksonesDto = aksonesDto; }

    public Integer getStadio() {  return stadio;  }

    public void setStadio(Integer stadio) {  this.stadio = stadio; }
}
