package com.adoptMe.service;

import com.adoptMe.entities.Dog;
import com.adoptMe.entities.Human;

public interface IDogService {

    void adopt(Dog dog, Human owner);

    boolean isAdopted(Dog dog);

    void leaveDog(Dog dog, Human human);

}
