package com.example.multilab.app2.Entities;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aksones")
public class Aksones {

    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @JoinColumn(name = "ARXES_ID", referencedColumnName = "ID")
    @ManyToOne(optional = false, fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Arxes arxh;

    @OneToMany(mappedBy = "aksonas", fetch = FetchType.LAZY)
    List<Deiktes> deiktes;

    public Aksones(){}

    public Aksones(String name, Arxes arxh) {
        this.name = name;
        this.arxh = arxh;
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

    public Arxes getArxh() {
        return arxh;
    }

    public void setArxh(Arxes arxh) {
        this.arxh = arxh;
    }

    public List<Deiktes> getDeiktes() { return deiktes; }

    public void setDeiktes(List<Deiktes> deiktes) { this.deiktes = deiktes;}
}
