package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain;

public class Place {

    private String address;

    public Place(String address) {
        this.address = address;
    }

    public void print(){
        System.out.println("--- Place ---");
        System.out.println("Adress: " + this.address);
    }

    public String getAddress() {
        return address;
    }

}
