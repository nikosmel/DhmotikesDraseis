package com.example.multilab.app2.dto;

import com.example.multilab.app2.Entities.Dhmos;

public class DhmosDto {

    private Long id;

    private String name;

    public DhmosDto(){}

    public DhmosDto(Dhmos dhmos){
        this.id = dhmos.getId();
        this.name = dhmos.getName();
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
}
