package anastasia.parfilo.project.entities;

public class Victim {
    private String name;
    private int age;
    private Superhero superhero;
    private boolean isSaved=false;

    public Victim(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setSuperhero(Superhero superhero) {
        this.superhero = superhero;
    }

    public boolean isSaved() {
        return isSaved;
    }

    public void setSaved(boolean saved) {
        isSaved = saved;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
