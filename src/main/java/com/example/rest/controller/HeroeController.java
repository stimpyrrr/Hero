package com.example.rest.controller;

import com.example.rest.dto.HeroeDTO;
import com.example.rest.entity.Heroe;
import com.example.rest.service.HeroeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // decorador permite crear una clase tipo restcontroller
@RequestMapping("/heroe") //Para que sea nivel 2, se necesita este decorador
public class HeroeController {

    private final HeroeService heroeService;

    public HeroeController(HeroeService heroeService) {
        this.heroeService = heroeService;
    }

    @GetMapping() // @GetMapping("/heroe") antes del nivel 2
    public List<Heroe> findAll(){
        return heroeService.findAll();
    }

    @GetMapping("/{id}") // PathVariable para recibir con un parametro en el path // @GetMapping("/heroe/{id}") antes del nivel 2
    public Heroe findById(@PathVariable("id") Integer id){
        return heroeService.findById(id);
    }
    // Otra forma de hacer un GET
    @RequestMapping(method = RequestMethod.GET, value = "/search/{name}")
    public Heroe findByName(@PathVariable("name") String name){
        return heroeService.findByName(name);
    }

    @PatchMapping("/{id}")
    public HeroeDTO updatePart(@PathVariable("id") Integer id, @RequestBody HeroeDTO heroe){
        return heroeService.updatePart(heroe);
    }

    @PostMapping
    public Heroe save(@RequestBody Heroe heroe){
        return heroeService.save(heroe);
    }

    @PutMapping("/{id}")
    public Heroe update(@PathVariable("id") Integer id, @RequestBody Heroe heroe){
        return heroeService.update(id, heroe);
    }
}
