package academy.devdojo.javaoneforall.javacore.objectorientation.Einitializationblock.domain;

public class Anime {

    private String name;
    private int[] episodes;

    // JVM execution
    // 1 - Allocate memory
    // 2 - Initialize attributes
    // 3 - Initialization block
    // 4 - Execute constructor

    {
        episodes = new int[150];
        for (int i = 0; i < episodes.length; i++) {
            episodes[i] = i + 1;
        }
    }

//    public Anime(String name, int numberOfEpisodes){
//        this.episodes = new int[numberOfEpisodes];
//        for (int i = 0; i < this.episodes.length; i++) {
//            episodes[i] = i + 1;
//            }
//        this.name = name;
//    }

    public Anime(String name){
        this.name = name;
    }

    public void print(){
        System.out.println(this.name);
        for (int episode : this.episodes) {
            System.out.print(episode + " ");
        };
    }


    }
