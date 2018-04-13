package com.example.multilab.app2.dto;

import com.example.multilab.app2.Entities.Aksones;
import com.example.multilab.app2.Entities.Arxes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ArxesDto {

    private Long id;

    private String name;

    private String subname;

    private String apotelesma;

    private Integer stadio;

    private List<AksonesDto> aksonesDtos = new ArrayList<>();

    public ArxesDto(){}

    public ArxesDto(Arxes arxh){
        this.id = arxh.getId();
        this.name = arxh.getName();
        this.subname = arxh.getSubname();
        this.apotelesma = arxh.getApotelesma();
        this.stadio = arxh.getStadio();
        if(Objects.nonNull(arxh.getAksones())) {
            arxh.getAksones().stream().forEach(aksones ->
                    this.aksonesDtos.add(new AksonesDto(aksones)));
        }
    }

    public Long getId() { return id;   }

    public void setId(Long id) {  this.id = id;  }

    public String getName() { return name;  }

    public void setName(String name) { this.name = name; }

    public String getSubname() { return subname; }

    public void setSubname(String subname) { this.subname = subname; }

    public String getApotelesma() { return apotelesma; }

    public void setApotelesma(String apotelesma) { this.apotelesma = apotelesma; }

    public Integer getStadio() { return stadio;  }

    public void setStadio(Integer stadio) {  this.stadio = stadio; }

    public List<AksonesDto> getAksonesDtos() { return aksonesDtos;}

    public void setAksonesDtos(List<AksonesDto> aksonesDtos) { this.aksonesDtos = aksonesDtos;}
}
