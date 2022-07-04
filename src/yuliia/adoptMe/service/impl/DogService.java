package yuliia.adoptMe.service.impl;

import yuliia.adoptMe.entities.Dog;
import yuliia.adoptMe.entities.Human;
import yuliia.adoptMe.service.IDogService;


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
