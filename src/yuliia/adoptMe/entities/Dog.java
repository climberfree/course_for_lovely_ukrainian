package yuliia.adoptMe.entities;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private Human owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Human getOwner() {
        return owner;
    }

    public void setOwner(Human owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dog{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", breed='").append(breed).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
