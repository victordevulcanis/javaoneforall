package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.domain.Player;

public class PlayerTest01 {

    public static void main(String[] args) {


        Player player1 = new Player("Pelé");
        Player player2 = new Player("Maradona");
        Player player3 = new Player("Klose");

        Player[] players = {player1, player2, player3};

        for (Player player : players) {
            player.print();
        }

    }
}
