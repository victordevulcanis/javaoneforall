package academy.devdojo.javaoneforall.javacore.objectorientation.Kenum.domain;

public class Customer {

    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getType() {
        return customerType;
    }

    public void CustomerType(CustomerType type) {
        this.customerType = type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
                ", paymentType=" + paymentType +
                '}';
    }
}
