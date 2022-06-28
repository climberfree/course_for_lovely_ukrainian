package anastasia.parfilo.project.service;

import anastasia.parfilo.project.entities.Enemy;
import anastasia.parfilo.project.entities.Superhero;
import anastasia.parfilo.project.entities.Victim;

public interface HeroicFeatService {
    public void saveVictim(Victim victim, Superhero superhero);
    public void beatEnemy(Superhero superhero, Enemy enemy);
    public void sendEnemyToPrison(Enemy enemy);
}
