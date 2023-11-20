package academy.devdojo.javaoneforall.javacore.objectorientation.Minterfaces.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Minterfaces.domain.DataBaseLoader;
import academy.devdojo.javaoneforall.javacore.objectorientation.Minterfaces.domain.DataLoader;
import academy.devdojo.javaoneforall.javacore.objectorientation.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {

    public static void main(String[] args) {

        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();

        dataBaseLoader.load();
        fileLoader.load();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkingPermission();
        fileLoader.checkingPermission();

        DataLoader.testingStaticMethod();


    }
}
