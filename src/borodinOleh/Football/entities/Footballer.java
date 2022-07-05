package borodinOleh.Football.entities;

import java.util.HashSet;
import java.util.Set;

public class Footballer {
    private String name;
    private String surname;
    private int age;
    private int gameNumber;
    private int salary;
    private Club team;
    private FootballPosition footballPositions;

    public Footballer(String name, String surname, int age, int gameNumber, int salary,  FootballPosition footballPositions) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gameNumber = gameNumber;
        this.salary = salary;
        this.footballPositions = footballPositions;
    }

    public FootballPosition getFootballPositions() {
        return footballPositions;
    }

    public void setFootballPositions(FootballPosition footballPositions) {
        this.footballPositions = footballPositions;
    }



    public Club getTeam(){
        return team;
    }

    public void setTeam(Club team){
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

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Footballer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gameNumber=" + gameNumber +
                ", salary=" + salary +
                '}';
    }
}
