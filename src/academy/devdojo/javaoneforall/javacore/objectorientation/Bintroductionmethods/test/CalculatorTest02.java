package academy.devdojo.javaoneforall.javacore.objectorientation.Bintroductionmethods.test;

import academy.devdojo.javaoneforall.javacore.objectorientation.Bintroductionmethods.domain.Calculator;

public class CalculatorTest02 {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.sumWithVarargs(1, 3, 2.5, 40, 21));

    }
}
