package academy.devdojo.javaoneforall.javacore.objectorientation.Kenum.domain;

public enum PaymentType {

    CREDIT{
        @Override
        public double calculateDiscount(double value){
            return value*0.05;
        }
    },
    DEBIT{
        @Override
        public double calculateDiscount(double value){
            return value*0.1;
        }
    };

    public abstract double calculateDiscount(double value);
}
