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
            List<Pets> petsList = List.of(new Pets("Toby", "dog", "medium", "morning", 4, "Javier, 32, me gusta hablar de fútbol", 32, "Busco gente con quien salir a pasear por las mañanas mientras hablamos del partido de ayer", "Madrid", "https://www.rd.com/wp-content/uploads/2020/11/GettyImages-1248902028.jpg", true),
                    new Pets("Kira", "dog", "big", "evening", 4, "Raquel, 32, me gusta el código", 32, "Quiero hablar de código mientras paseo a mi perra por las noches", "Barcelona", "http://ghk.h-cdn.co/assets/16/08/gettyimages-122137874.jpg", false),
                    new Pets("Kitty", "cat", "small", "evening", 4, "Isabel, 46, amante de los gatos", 46, "A mi gatita también le gusta pasear, vente con nosotras!", "Barcelona", "https://wallup.net/wp-content/uploads/2018/10/07/458379-cat-animal-pet-cats-kitty-cute-sweet.jpg", false),
                    new Pets("Lorito", "parrot", "big", "morning", 4, "Alberto, 24, amante de los pájaros", 24, "Vente a pasear con mi Lorito, se lleva bien con perros pero no gatos", "Valencia", "https://images.fineartamerica.com/images-medium-large/green-parrot-on-green-background-roni-delmonico.jpg", true),
                    new Pets("Piolín", "canary", "small", "morning", 2, "Abuelita, 73, amante de los pajaritos y los gatitos", 73, "Mi Piolín necesita estirar las alas, vamos juntos y nos sentamos a hacer ganchillo mientras juegan", "Paris", "https://i.pinimg.com/736x/6d/28/24/6d28244dd5ec09393dc291d17c565a8d--tweety-bird-tweet-tweet.jpg", true),
                    new Pets("Serpi", "snake", "small", "evening", 1, "Rosa, 42, me gusta vestir a mi Serpi", 42, "Serpi necesita salir de vez en cuando", "Sevilla", "https://i.pinimg.com/originals/14/aa/5c/14aa5c1f3236c1d46b339aa3eb0dd621.jpg", false)
            );
            petsService.saveAll(petsList);
        }

    }
}
