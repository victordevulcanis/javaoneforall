package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.domain.Team;

public class PlayerTest02 {

    public static void main(String[] args) {

        Player player = new Player("Pelé");

        Team team1 = new Team("Brazilian National Team");

        player.setTeam(team1);

        player.print();


    }

}
