package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.domain;

public class Team {

    private String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;
    }

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public void print() {
        System.out.println("Team: " + this.name);
        if(players != null){
            for(Player player : players){
                System.out.println(player);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
