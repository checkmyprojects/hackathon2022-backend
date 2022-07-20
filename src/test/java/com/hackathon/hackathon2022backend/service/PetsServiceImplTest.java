package com.hackathon.hackathon2022backend.service;

import com.hackathon.hackathon2022backend.models.Pets;
import com.hackathon.hackathon2022backend.repository.PetsRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class PetsServiceImplTest {

    @Mock
    private PetsRepo petsRepo;

    private PetsServiceImpl underTest;

    @BeforeEach
    void setUp(){
        underTest = new PetsServiceImpl(petsRepo);
    }

    @Test
    void findAll() {
        underTest.findAll();
        verify(petsRepo).findAll();
    }

    @Test
    void findById() throws Exception{

        Pets pet = new Pets(1L,"Kira", "dog", "big", "evening", 4, "Raquel, me gusta el código", 32, "Quiero hablar de código mientras paseo a mi perra por las noches", "barcelona", "http://ghk.h-cdn.co/assets/16/08/gettyimages-122137874.jpg", false);
        petsRepo.save(pet);

        Optional<Pets> petTest = petsRepo.findById(pet.getId());
        assertThat(petTest).isEqualTo(Optional.empty());


//        ArgumentCaptor<Pets> petsArgumentCaptor =
//                ArgumentCaptor.forClass(Pets.class);
//        verify(petsRepo).findById(petsArgumentCaptor.capture().getId());
//        Long testId = petsArgumentCaptor.capture().getId();
//        assertThat(testId).isEqualTo(pet.getId());
    }

    @Test
    void saveAll() {
        List<Pets> petsList = List.of(new Pets("Toby", "dog", "medium", "morning", 4, "Javier, me gusta hablar de fútbol", 32, "Busco gente con quien salir a pasear por las mañanas mientras hablamos del partido de ayer", "madrid", "https://www.rd.com/wp-content/uploads/2020/11/GettyImages-1248902028.jpg", true),
                new Pets("Kira", "dog", "big", "evening", 4, "Raquel, me gusta el código", 32, "Quiero hablar de código mientras paseo a mi perra por las noches", "barcelona", "http://ghk.h-cdn.co/assets/16/08/gettyimages-122137874.jpg", false),
                new Pets("Kitty", "cat", "small", "evening", 4, "Raquel, me gusta el código", 32, "Quiero hablar de código mientras paseo a mi perra por las noches", "barcelona", "https://wallup.net/wp-content/uploads/2018/10/07/458379-cat-animal-pet-cats-kitty-cute-sweet.jpg", false),
                new Pets("Lorito", "parrot", "big", "morning", 4, "Alberto, amante de los pájaros", 32, "Vente a pasear con mi Lorito, se lleva bien con perros pero no gatos", "valencia", "https://images.fineartamerica.com/images-medium-large/green-parrot-on-green-background-roni-delmonico.jpg", true),
                new Pets("Piolín", "canary", "small", "morning", 2, "Abuelita, amante de los pajaritos y los gatitos", 32, "Mi Piolín necesita estirar las alas, vamos juntos y nos sentamos a hacer ganchillo mientras juegan", "paris", "https://i.pinimg.com/736x/6d/28/24/6d28244dd5ec09393dc291d17c565a8d--tweety-bird-tweet-tweet.jpg", true)
        );
        petsRepo.saveAll(petsList);
        verify(petsRepo).saveAll(petsList);
    }

    @Test
    void findPetByType() {
        petsRepo.findAllByType("dog");
        verify(petsRepo).findAllByType("dog");
    }

    @Test
    void findPetsByLocation() {
        petsRepo.findAllByType("dog");
        verify(petsRepo).findAllByType("dog");
    }

    @Test
    void findPetsBySize() {
        petsRepo.findAllBySize("dog");
        verify(petsRepo).findAllBySize("dog");
    }

    @Test
    void findPetsBySchedule() {
        petsRepo.findAllBySchedule("dog");
        verify(petsRepo).findAllBySchedule("dog");
    }

    @Test
    void findPetsByFavouriteIsTrue() {
        petsRepo.findAllByFavouriteIsTrue();
        verify(petsRepo).findAllByFavouriteIsTrue();
    }
}