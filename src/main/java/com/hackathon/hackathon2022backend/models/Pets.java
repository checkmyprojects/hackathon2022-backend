package com.hackathon.hackathon2022backend.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String type; // dog, cat, etc. FILTER

    private String size; // big, small, medium. FILTER

    private String schedule; // morning, evening, midday. FILTER

    private int age; // pet age

    private String owner; // brief description of the owner

    private int ownerAge;

    private String description;

    private String location; // location. FILTER

    private String img;

    private boolean favourite; // add to favourites

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getOwnerAge() {
        return ownerAge;
    }

    public void setOwnerAge(int ownerAge) {
        this.ownerAge = ownerAge;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public Pets(Long id, String name, String type, String size, String schedule, int age, String owner, int ownerAge, String description, String location, String img, boolean favourite) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.size = size;
        this.schedule = schedule;
        this.age = age;
        this.owner = owner;
        this.ownerAge = ownerAge;
        this.description = description;
        this.location = location;
        this.img = img;
        this.favourite = favourite;
    }

    public Pets(String name, String type, String size, String schedule, int age, String owner, int ownerAge, String description, String location, String img, boolean favourite) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.schedule = schedule;
        this.age = age;
        this.owner = owner;
        this.ownerAge = ownerAge;
        this.description = description;
        this.location = location;
        this.img = img;
        this.favourite = favourite;
    }

    public Pets() {
    }
}
