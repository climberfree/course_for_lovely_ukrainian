package com.adoptMe.service.impl;

import com.adoptMe.entities.Dog;
import com.adoptMe.entities.Human;
import com.adoptMe.service.IDogService;


public class DogService implements IDogService {
    @Override
    public void adopt(Dog dog, Human owner) {
        dog.setOwner(owner);

        owner.addDog(dog);
    }

    @Override
    public boolean isAdopted(Dog dog) {
        return dog.getOwner() != null;
    }

    @Override
    public void leaveDog(Dog dog, Human human) {
        dog.setOwner(null);
    }
}
