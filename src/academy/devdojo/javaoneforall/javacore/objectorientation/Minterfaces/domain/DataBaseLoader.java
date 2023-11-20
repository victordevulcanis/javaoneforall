package academy.devdojo.javaoneforall.javacore.objectorientation.Minterfaces.domain;

public class DataBaseLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from database");
    }

    @Override
    public void remove() {
        System.out.println("Removing data from database");
    }



}
