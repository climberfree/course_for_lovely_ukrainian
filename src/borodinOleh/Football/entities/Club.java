package borodinOleh.Football.entities;

import java.util.HashSet;
import java.util.Set;

public class Club {
    private String name;
    private int foundationYear;
    private String city;
    private int budget;
    private Liga liga;
    private Set<Coach> сoach = new HashSet<>();
    private Set<Footballer> footballer = new HashSet<>();

    public Club(String name, int foundationYear, String city, int budget, Liga liga) {
        this.name = name;
        this.foundationYear = foundationYear;
        this.city = city;
        this.budget = budget;
        this.liga = liga;
    }

    public Liga getLiga() {
        return liga;
    }

    public void setLiga(Liga liga) {
        this.liga = liga;
    }

    public void setFootballer(Set<Footballer> footballer) {
        this.footballer = footballer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }


    public Set<Coach> getСoach() {
        return сoach;
    }

    public void setСoach(Set<Coach> сoach) {
        this.сoach = сoach;
    }

    public Set<Footballer> getFootballer() {
        return footballer;
    }

    public void addFootballer(Set<Footballer> footballer) {
        footballer.add((Footballer) footballer);
    }

    @Override
    public String toString() {
        return "Club{" +
                "name='" + name + '\'' +
                ", foundationYear=" + foundationYear +
                ", city='" + city + '\'' +
                ", budget=" + budget +
                ", liga=" + liga +
                ", сoach=" + сoach +
                ", footballer=" + footballer +
                '}';
    }
}
