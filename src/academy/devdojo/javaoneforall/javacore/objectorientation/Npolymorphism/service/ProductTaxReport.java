package academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.service;

import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.domain.Product;
import academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.domain.Tomato;

public class ProductTaxReport {

    public static void generateProductTaxReport(Product product){
        System.out.println("Starting the report for this product");
        double taxValue = product.calculateTaxValue();
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Tax Value: " + product.calculateTaxValue());
        double totalValue = taxValue + product.getPrice();
        System.out.println("Total Value: " + totalValue);
        if(product instanceof Tomato){
            System.out.println("Best Consume Before: " + ((Tomato) product).getBestConsumeBefore());
        }
    }

}
