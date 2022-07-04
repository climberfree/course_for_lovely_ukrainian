package yuliia.adoptMe;

import yuliia.adoptMe.entities.Dog;
import yuliia.adoptMe.entities.Human;
import yuliia.adoptMe.entities.Sex;
import yuliia.adoptMe.service.IDogService;
import yuliia.adoptMe.service.impl.DogService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, List<Dog>> dogs = new HashMap<>();



        Human eduard = new Human("Eduard", Sex.MASCULINE);

        Dog dog = new Dog("Bobik", 5, "Chaw-chaw");

        IDogService dogService = new DogService();

        System.out.println("Is adopted "+dog.getName()+"? "+dogService.isAdopted(dog));
        System.out.println("Eduard's dogs: "+ eduard.getDogs());

        dogService.adopt(dog, eduard);

        System.out.println("Is adopted "+dog.getName()+"? "+dogService.isAdopted(dog));
        System.out.println("Eduard's dogs: "+ eduard.getDogs());
    }
}
