package com.hackathon.hackathon2022backend.repository;

import com.hackathon.hackathon2022backend.models.Pets;
import com.hackathon.hackathon2022backend.service.PetsService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private final PetsService petsService;

    public SampleDataLoader(PetsService petsService) {
        this.petsService = petsService;
    }

    @PostConstruct
    public void addSamplePets(){


        if (petsService.findAll().isEmpty()){
            List<Pets> petsList = List.of(new Pets("Toby", "Dog", "medium", "morning", 4, "Javier, me gusta hablar de fútbol", 32, "Busco gente con quien salir a pasear por las mañanas mientras hablamos del partido de ayer", "Madrid", "https://www.rd.com/wp-content/uploads/2020/11/GettyImages-1248902028.jpg"),
                    new Pets("Kira", "Dog", "big", "evening", 4, "Raquel, me gusta el código", 32, "Quiero hablar de código mientras paseo a mi perra por las noches", "Barcelona", "http://ghk.h-cdn.co/assets/16/08/gettyimages-122137874.jpg"),
            new Pets("Kitty", "Cat", "small", "evening", 4, "Raquel, me gusta el código", 32, "Quiero hablar de código mientras paseo a mi perra por las noches", "Barcelona", "https://wallup.net/wp-content/uploads/2018/10/07/458379-cat-animal-pet-cats-kitty-cute-sweet.jpg")
            );
            petsService.saveAll(petsList);
        }

    }
}
