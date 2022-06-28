package anastasia.parfilo.project.entities;

public class Enemy {
    private String name;
    private String power;
    private int damage;
    private boolean isInPrison;

    public Enemy(String name, String power, int damage) {
        this.name = name;
        this.power = power;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public boolean isInPrison() {
        return isInPrison;
    }

    public void setInPrison(boolean inPrison) {
        isInPrison = inPrison;
    }

    public String getName() {
        return name;
    }
}
