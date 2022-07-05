package borodinOleh.Football.service;

import borodinOleh.Football.entities.Club;
import borodinOleh.Football.entities.Coach;
import borodinOleh.Football.entities.Footballer;

public interface ClubService {

    void football(Club club, Footballer footballer, Coach coach);
}
