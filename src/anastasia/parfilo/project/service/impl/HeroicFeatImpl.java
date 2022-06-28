package anastasia.parfilo.project.service.impl;

import anastasia.parfilo.project.entities.Enemy;
import anastasia.parfilo.project.entities.Superhero;
import anastasia.parfilo.project.entities.Victim;
import anastasia.parfilo.project.service.HeroicFeatService;

public class HeroicFeatImpl implements HeroicFeatService {
    @Override
    public void saveVictim(Victim victim, Superhero superhero) {
        victim.setSaved(true);
        victim.setSuperhero(superhero);
        superhero.addVictim(victim);
    }

    @Override
    public void beatEnemy(Superhero superhero, Enemy enemy) {
        if(superhero.getDamage()>enemy.getDamage()){
            superhero.addEnemy(enemy);
            superhero.setDamage(superhero.getDamage()+enemy.getDamage());
            sendEnemyToPrison(enemy);
        }else if(superhero.getDamage()==enemy.getDamage()){
            superhero.addEnemy(enemy);
            sendEnemyToPrison(enemy);
        }else{
            superhero.setDamage(superhero.getDamage()-enemy.getDamage());
        }
    }

    @Override
    public void sendEnemyToPrison(Enemy enemy) {
        enemy.setInPrison(true);
    }
}
