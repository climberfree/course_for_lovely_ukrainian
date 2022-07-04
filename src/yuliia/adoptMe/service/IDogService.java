package yuliia.adoptMe.service;

import yuliia.adoptMe.entities.Dog;
import yuliia.adoptMe.entities.Human;

public interface IDogService {

    void adopt(Dog dog, Human owner);

    boolean isAdopted(Dog dog);

    void leaveDog(Dog dog, Human human);

}
