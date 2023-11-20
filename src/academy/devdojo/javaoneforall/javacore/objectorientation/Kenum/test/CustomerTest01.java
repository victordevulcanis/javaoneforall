package academy.devdojo.javaoneforall.javacore.objectorientation.Kenum.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Kenum.domain.Customer;
import academy.devdojo.javaoneforall.javacore.objectorientation.Kenum.domain.CustomerType;
import academy.devdojo.javaoneforall.javacore.objectorientation.Kenum.domain.PaymentType;

public class CustomerTest01 {

    public static void main(String[] args) {

        Customer customer1 = new Customer("John", CustomerType.COMPANY, PaymentType.CREDIT);
        Customer customer2 = new Customer("Josh", CustomerType.INDIVIDUAL, PaymentType.DEBIT);

        System.out.println(customer1);
        System.out.println(customer2);

        CustomerType customerType = CustomerType.getByReportValue("individual");

        System.out.println(customerType);

    }

}
