package academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.domain.Computer;
import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.domain.Tomato;
import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.service.ProductTaxReport;

public class ProductTest02 {

    public static void main(String[] args) {

        Computer computer = new Computer("Ryzen 9", 1000);

        Tomato tomato = new Tomato("Italian", 5);
        tomato.setBestConsumeBefore("31/12/2023");

        ProductTaxReport.generateProductTaxReport(computer);

        ProductTaxReport.generateProductTaxReport(tomato);


    }

}
