package yuliia.adoptMe.entities;

import java.util.HashSet;
import java.util.Set;

public class Human {

    private String name;
    private Sex sex;
    private Set<Dog> dogs = new HashSet<>();

    public Human(String name, Sex sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Dog> getDogs() {
        return dogs;
    }

    public void addDog(Dog dog) {
        dogs.add(dog);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Human{");
        sb.append("name='").append(name).append('\'');
        sb.append(", dogs=").append(dogs);
        sb.append('}');
        return sb.toString();
    }
}
