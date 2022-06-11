package com.example.rest.service.impl;

import com.example.rest.dto.HeroeDTO;
import com.example.rest.entity.Heroe;
import com.example.rest.repository.HeroeRepository;
import com.example.rest.service.HeroeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service // se usa para volver esta clase como servicio, va a ser llamada por controlladores tipo REST
public class HeroeServiceImpl implements HeroeService {

    private final HeroeRepository heroeRepository;

    public HeroeServiceImpl(HeroeRepository heroeRepository) {
        this.heroeRepository = heroeRepository;
    }

    @Override
    public List<Heroe> findAll() {
        return heroeRepository.findAll();
    }

    @Override
    public Heroe findById(Integer id) {
        return heroeRepository.findById(id);
    }

    @Override
    public Heroe save(Heroe heroe) {
        return heroe;
    }

    @Override
    public Heroe findByName(String name) {
        return heroeRepository.findByName(name);
    }

    @Override
    public Heroe update(Integer id, Heroe heroe) {
        return heroe;
    }

    @Override
    public HeroeDTO updatePart(HeroeDTO heroe) {
        return heroeRepository.updatePart(heroe);
    }


}
