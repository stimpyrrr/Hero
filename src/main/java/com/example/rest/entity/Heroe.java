package com.example.rest.entity;

import java.util.List;

public class Heroe {
    private Integer id;
    private String name;
    private List<String> superPoderes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSuperPoder() {
        return superPoderes;
    }

    public void setSuperPoderes(List<String> superPoder) {
        this.superPoderes = superPoder;
    }
}
