package borodinOleh.Football.runner;

import borodinOleh.Football.entities.Club;
import borodinOleh.Football.entities.FootballPosition;
import borodinOleh.Football.entities.Footballer;
import borodinOleh.Football.entities.Liga;

public class Main {
    public static void main(String[] args) {
        Footballer f1 = new Footballer("Sadio", "Mane", 30, 10,25000, FootballPosition.WINGER);
        System.out.println(f1);
        Club c1 = new Club("Liverpool", 1892,"Liverpool", 30000000, Liga.EPL);
        System.out.println(c1);
    }
}
