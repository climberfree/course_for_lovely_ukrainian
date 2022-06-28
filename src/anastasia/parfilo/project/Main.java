package anastasia.parfilo.project;

import anastasia.parfilo.project.entities.Enemy;
import anastasia.parfilo.project.entities.Superhero;
import anastasia.parfilo.project.entities.Victim;
import anastasia.parfilo.project.service.HeroicFeatService;
import anastasia.parfilo.project.service.impl.HeroicFeatImpl;

public class Main {
    public static void main(String[] args) {
        Superhero spiderman = new Superhero("Spiderman", "spider web shooting", 85);
        Victim mj = new Victim("Mary Jane", 20);
        Enemy electro = new Enemy("Electro", "controlling electricity", 78);

        System.out.println(spiderman.toString());

        HeroicFeatService heroicFeatService=new HeroicFeatImpl();
        heroicFeatService.saveVictim(mj,spiderman);
        heroicFeatService.beatEnemy(spiderman,electro);

        System.out.println(spiderman.toString());
    }
}
