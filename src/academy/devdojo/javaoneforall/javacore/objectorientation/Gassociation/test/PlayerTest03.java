package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.domain.Player;
import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.domain.Team;

public class PlayerTest03 {

    public static void main(String[] args) {

        Player player = new Player("Pelé");
        Team team = new Team("Brazil");

        player.setTeam(team);



    }

}
