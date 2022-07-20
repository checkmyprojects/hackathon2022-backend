package com.hackathon.hackathon2022backend.repository;

import com.hackathon.hackathon2022backend.models.Pets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PetsRepo extends JpaRepository<Pets, Long> {

    List<Pets> findAllByType(String type);
    List<Pets> findAllByLocation(String location);
    List<Pets> findAllBySize(String size);
    List<Pets> findAllBySchedule(String schedule);
    List<Pets> findAllByFavouriteIsTrue();
}
