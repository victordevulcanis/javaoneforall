package academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.service.ProductTaxReport;

public class ProductTest01 {

    public static void main(String[] args) {

        Computer computer = new Computer("Ryzen 9", 1000);

        Tomato tomato = new Tomato("Italian", 5);

        ProductTaxReport.generateProductTaxReport(tomato);

        System.out.println(computer.getName());
        System.out.println(computer.getPrice());

        System.out.println(tomato.getName());
        System.out.println(tomato.getPrice());

    }


}
