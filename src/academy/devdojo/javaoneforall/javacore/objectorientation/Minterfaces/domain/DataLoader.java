package academy.devdojo.javaoneforall.javacore.objectorientation.Minterfaces.domain;

public interface DataLoader {

    void load();

    default void checkingPermission(){
        System.out.println("Checkin permission in the file");
    }

    static void testingStaticMethod(){
        System.out.println("testing static method");
    }

}
