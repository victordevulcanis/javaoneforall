package academy.devdojo.javaoneforall.javacore.objectorientation.Dconstructor.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Dconstructor.domain.Anime;

public class AnimeTest01 {

    public static void main(String[] args) {

        Anime anime = new Anime("Akudama Drive", "TV", 12);
//        anime.setName("Akudama Drive");
//        anime.setType("TV");
//        anime.setEpisodes(12);
        anime.print();
    }

}
