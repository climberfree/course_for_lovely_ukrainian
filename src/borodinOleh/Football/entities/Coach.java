package borodinOleh.Football.entities;

public class Coach {
    private String name;
    private String surname;
    private int age;
    private int salary;
    private Club team;

    public Coach(String name, String surname, int age, int salary, Club team) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Club getTeam() {
        return team;
    }

    public void setTeam(Club team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Сoach{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", team=" + team +
                '}';
    }
}
