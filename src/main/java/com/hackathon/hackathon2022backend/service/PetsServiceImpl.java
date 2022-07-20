package com.hackathon.hackathon2022backend.service;

import com.hackathon.hackathon2022backend.models.Pets;
import com.hackathon.hackathon2022backend.repository.PetsRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
public class PetsServiceImpl implements PetsService{

    private final PetsRepo petsRepo;

    public PetsServiceImpl(PetsRepo petsRepo) {
        this.petsRepo = petsRepo;
    }

    @Override
    public List<Pets> findAll() {
        return petsRepo.findAll();
    }

    @Override
    public Pets findById(Long id) {
        return petsRepo.findById(id).orElseThrow(()-> new RuntimeException("Pet not found"));
    }

    @Override
    public List<Pets> saveAll(List<Pets> petsList) {
        return petsRepo.saveAll(petsList);
    }

    @Override
    public List<Pets> findPetByType(String type) {
        return petsRepo.findAllByType(type);
    }
}
