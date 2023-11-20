package academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.repository.Repository;

public class DatabaseRepositoryService implements Repository {

    @Override
    public void save() {
        System.out.println("Saving in the database");
    }

}
