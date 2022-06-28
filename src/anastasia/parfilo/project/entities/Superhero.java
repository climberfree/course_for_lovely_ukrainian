package anastasia.parfilo.project.entities;

import java.util.ArrayList;
import java.util.List;

public class Superhero {
    private String name;
    private String power;
    private int damage;
    private List<Victim> victims = new ArrayList<>();
    private List<Enemy> enemies = new ArrayList<>();

    public Superhero(String name, String power, int damage) {
        this.name = name;
        this.power = power;
        if(damage > 0 && damage<=100) {
            this.damage = damage;
        }
    }

    public void addVictim(Victim victim){
        victims.add(victim);
    }

    public void addEnemy(Enemy enemy){
        enemies.add(enemy);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", damage=" + damage +
                ", victims=" + getVictims() +
                ", enemies=" + getEnemies() +
                '}';
    }

    public String getVictims() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Victim v:victims) {
            stringBuilder.append(v.getName()).append(" ").append(v.getAge()).append(";");
        }
        return stringBuilder.toString();
    }

    public String getEnemies() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Enemy e:enemies) {
            stringBuilder.append(e.getName()).append(";");
        }
        return stringBuilder.toString();
    }
}
