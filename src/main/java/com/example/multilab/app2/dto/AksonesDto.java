package com.example.multilab.app2.dto;

import com.example.multilab.app2.Entities.Aksones;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AksonesDto {

    private Long id;

    private String name;

    private ArxesDto arxesDto;

    private List<DeiktesDto> deiktesDtos  = new ArrayList<>();

    public AksonesDto(){}

    public AksonesDto (Aksones aksones){
        this.id = aksones.getId();
        this.name = aksones.getName();
        if(Objects.nonNull(aksones.getDeiktes())) {
            aksones.getDeiktes().stream().forEach(deiktes ->
                    this.deiktesDtos.add(new DeiktesDto(deiktes)));
        }
    }

    public Long getId() {  return id;  }

    public void setId(Long id) {  this.id = id;  }

    public String getName() {  return name; }

    public void setName(String name) {  this.name = name; }

    public ArxesDto getArxesDto() {  return arxesDto; }

    public void setArxesDto(ArxesDto arxesDto) {  this.arxesDto = arxesDto; }

    public List<DeiktesDto> getDeiktesDtos() { return deiktesDtos; }

    public void setDeiktesDtos(List<DeiktesDto> deiktesDtos) { this.deiktesDtos = deiktesDtos; }
}
