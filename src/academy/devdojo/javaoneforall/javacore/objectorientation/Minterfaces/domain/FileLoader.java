package academy.devdojo.javaoneforall.javacore.objectorientation.Minterfaces.domain;

public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void load() {
        System.out.println("Loading data from file");
    }

    @Override
    public void remove() {
        System.out.println("Remove data from file");
    }

}
