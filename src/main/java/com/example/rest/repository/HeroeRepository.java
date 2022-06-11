package com.example.rest.repository;

import com.example.rest.dto.HeroeDTO;
import com.example.rest.entity.Heroe;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class HeroeRepository {
    //CRUD / Create / Read / Update / Delete

    // Devolver lista de heroes
    public List<Heroe> findAll(){
        List<Heroe> heroes = new ArrayList<>();
        Heroe heroe= new Heroe();
        heroe.setId(1);
        heroe.setName("Spiderman");
        List<String> superPoderes1 = new ArrayList<>();
        String poder1 = "Telaraña";
        superPoderes1.add(poder1);
        String poder2 = "Super Fuerza";
        superPoderes1.add(poder2);
        heroe.setSuperPoderes(superPoderes1);
        heroes.add(heroe);

        Heroe heroe2 = new Heroe();
        heroe2.setId(2);
        heroe2.setName("Hulk");
        List<String> superPoderes2 = new ArrayList<>();
        poder1 = "Ira";
        superPoderes2.add(poder1);
        poder2 = "Super Fuerza";
        superPoderes2.add(poder2);
        heroe2.setSuperPoderes(superPoderes2);
        heroes.add(heroe2);

        return heroes;
    }

    public Heroe findById(Integer id){
        Heroe heroe= new Heroe();
        heroe.setId(1);
        heroe.setName("Spiderman");
        List<String> superPoderes1 = new ArrayList<>();
        String poder1 = "Telaraña";
        superPoderes1.add(poder1);
        String poder2 = "Super Fuerza";
        superPoderes1.add(poder2);
        heroe.setSuperPoderes(superPoderes1);

        return heroe;
    }

    public Heroe findByName(String name) {
        Heroe heroe= new Heroe();
        heroe.setId(1);
        heroe.setName("Spiderman");
        List<String> superPoderes1 = new ArrayList<>();
        String poder1 = "Telaraña";
        superPoderes1.add(poder1);
        String poder2 = "Super Fuerza";
        superPoderes1.add(poder2);
        heroe.setSuperPoderes(superPoderes1);

        return heroe;
    }

    public HeroeDTO updatePart(HeroeDTO heroe) {
        return heroe;
    }
}
