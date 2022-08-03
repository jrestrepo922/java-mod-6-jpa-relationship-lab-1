package org.example.models;

import javax.persistence.*;

@Entity
@Table
public class Country {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "COUNTRY_NAME")
    private String name;

    @OneToOne
    private Capital capital;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Capital getCapital() {
        return capital;
    }

    public void setCapital(Capital capital) {
        this.capital = capital;
    }
}
