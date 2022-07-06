package com.adoptMe;

import com.adoptMe.config.Database;
import com.adoptMe.entities.Dog;
import com.adoptMe.entities.Human;
import com.adoptMe.entities.Sex;
import com.adoptMe.repositories.DogRepository;
import com.adoptMe.service.IDogService;
import com.adoptMe.service.impl.DogService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        DogRepository dogRepository = new DogRepository();
        List<Dog> dogs =  dogRepository.dogs();
        System.out.println(dogs);
//        Map<String, List<Dog>> dogs = new HashMap<>();
//
//
//
//        Human eduard = new Human("Eduard", Sex.MASCULINE);
//
//        Dog dog = new Dog("Bobik", 5, "Chaw-chaw");
//
//        IDogService dogService = new DogService();
//
//        System.out.println("Is adopted "+dog.getName()+"? "+dogService.isAdopted(dog));
//        System.out.println("Eduard's dogs: "+ eduard.getDogs());
//
//        dogService.adopt(dog, eduard);
//
//        System.out.println("Is adopted "+dog.getName()+"? "+dogService.isAdopted(dog));
//        System.out.println("Eduard's dogs: "+ eduard.getDogs());
    }
}
