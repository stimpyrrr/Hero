package com.example.rest.service;

import com.example.rest.dto.HeroeDTO;
import com.example.rest.entity.Heroe;

import java.util.List;

// se hace como interface para poder reutilizar los metodos en otras clases
public interface HeroeService {
    List<Heroe> findAll();

    Heroe findById(Integer id);

    Heroe save(Heroe heroe);

    Heroe findByName(String name);

    Heroe update(Integer id, Heroe heroe);

    HeroeDTO updatePart(HeroeDTO heroe);
}
