package org.example.models;

import javax.persistence.*;

@Entity
@Table
public class Capital {
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "CAPITAL_NAME")
    private String name;

    @OneToOne(mappedBy = "capital")
    //@OneToOne
    private Country country;

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

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
