package com.cooltour.cooltour.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"name"})})
public class Object {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public double latitude;
    public double longitude;
    public String name;
    public String type;
    public String wikidata;

    public Object(Long id, double latitude, double longitude, String name, String type, String wikidata) {
        this.id = id;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.type = type;
        this.wikidata = wikidata;
    }

    public Object() {
    }
}
