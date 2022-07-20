package com.hackathon.hackathon2022backend.service;

import com.hackathon.hackathon2022backend.models.Pets;

import java.util.List;

public interface PetsService {

    List<Pets> findAll();
    Pets findById(Long id);
    List<Pets> saveAll(List<Pets> petsList);
    List<Pets> findPetByType(String type);
}
