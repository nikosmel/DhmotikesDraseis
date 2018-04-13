package com.example.multilab.app2.Entities;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "dhmos")
public class Dhmos {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @JoinTable(name = "dhmos_deiktes", joinColumns = {
            @JoinColumn(name = "DHMOS_ID",
                    referencedColumnName = "ID")},
            inverseJoinColumns = {
                    @JoinColumn(name = "DEIKTES_ID", referencedColumnName = "ID")})
    @ManyToMany (cascade = CascadeType.ALL)
    private List<Deiktes> deiktesList = new ArrayList<>();

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

    public List<Deiktes> getDeiktesList() {
        return deiktesList;
    }

    public void setDeiktesList(List<Deiktes> deiktesList) {
        this.deiktesList = deiktesList;
    }
}
