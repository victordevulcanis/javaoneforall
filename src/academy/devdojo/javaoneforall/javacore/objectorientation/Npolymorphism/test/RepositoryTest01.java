package academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.repository.Repository;
import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.service.FileRepositoryService;

public class RepositoryTest01 {

    public static void main(String[] args) {

        Repository repository = new FileRepositoryService();

        repository.save();

    }

}
