package borodinOleh.Football.service.implClubService;

import borodinOleh.Football.entities.Club;
import borodinOleh.Football.entities.Coach;
import borodinOleh.Football.entities.Footballer;

import java.util.Set;

public class ClubService implements borodinOleh.Football.service.ClubService {
    @Override
    public void football(Club club, Footballer footballer, Coach coach) {
        club.addFootballer((Set<Footballer>) footballer);
        club.setСoach((Set<Coach>) coach);

    }
}
