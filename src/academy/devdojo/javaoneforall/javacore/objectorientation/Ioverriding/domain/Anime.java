package academy.devdojo.javaoneforall.javacore.objectorientation.Ioverriding.domain;

public class Anime {

    private String name;

    public Anime(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Anime: " + this.name;
    }

}
