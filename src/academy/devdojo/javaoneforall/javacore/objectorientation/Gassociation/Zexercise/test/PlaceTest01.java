package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.Zexercise.domain.Place;

public class PlaceTest01 {

    public static void main(String[] args) {

        Place place1 = new Place("Street 0, Building 1, Room 4");

        place1.print();

        System.out.println(place1.getAddress());

    }
}
