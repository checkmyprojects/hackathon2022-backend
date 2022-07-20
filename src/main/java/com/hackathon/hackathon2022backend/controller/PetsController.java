package com.hackathon.hackathon2022backend.controller;

import com.hackathon.hackathon2022backend.models.Pets;
import com.hackathon.hackathon2022backend.service.PetsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/api/pets")
@RestController
public class PetsController {

    private final PetsService petsService;

    @Autowired
    public PetsController(PetsService petsService) {
        this.petsService = petsService;}

    @GetMapping("/list")
    public List<Pets> getAppPets(){
        return petsService.findAll();
    }
    @GetMapping("/id/{id}")
    public Pets findPetById(@PathVariable Long id){
        return petsService.findById(id);
    }

    @GetMapping("/filter/type/{type}")
    public List<Pets> filterPetsByType(@PathVariable String type){
        return petsService.findPetByType(type);
    }

    @GetMapping("/filter/location/{location}")
    public List<Pets> filterPetsByLocation(@PathVariable String location){
        return petsService.findPetsByLocation(location);
    }

    @GetMapping("/filter/size/{size}")
    public List<Pets> filterPetsBySize(@PathVariable String size){
        return petsService.findPetsBySize(size);
    }

    @GetMapping("/filter/schedule/{schedule}")
    public List<Pets> filterPetsBySchedule(@PathVariable String schedule){
        return petsService.findPetsBySchedule(schedule);
    }

}
