package academy.devdojo.javaoneforall.javacore.objectorientation.Npolymorphism.domain;

public class Tomato extends Product {

    private String bestConsumeBefore;
    public static final double TAX_PERCENTAGE = 0.06;

    public Tomato(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxValue() {
        System.out.println("Calculating tax for tomato");
        return this.price * TAX_PERCENTAGE;
    }

    public String getBestConsumeBefore() {
        return bestConsumeBefore;
    }

    public void setBestConsumeBefore(String bestConsumeBefore) {
        this.bestConsumeBefore = bestConsumeBefore;
    }

}
