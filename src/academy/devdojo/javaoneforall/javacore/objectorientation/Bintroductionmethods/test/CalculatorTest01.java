package academy.devdojo.javaoneforall.javacore.objectorientation.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Bintroductionmethods.domain.Calculator;

public class CalculatorTest01 {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.sumTwoNumbers(1, 2));

        System.out.println(calculator.subtractTwoNumbers(2, 1));

        System.out.println(calculator.multiplyTwoNumbers(2, 3));

        System.out.println(calculator.divideTwoNumbers(3, 2));

        System.out.println(calculator.divideTwoNumbers(3, 0));

    }
}
