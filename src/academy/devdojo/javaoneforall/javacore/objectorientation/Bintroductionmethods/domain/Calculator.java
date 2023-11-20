package academy.devdojo.javaoneforall.javacore.objectorientation.Bintroductionmethods.domain;

public class Calculator {

    public int sumTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public int subtractTwoNumbers(int number1, int number2) {
        return number1 - number2;
    }

    public int multiplyTwoNumbers(int number1, int number2){
        return number1 * number2;
    }

    public double divideTwoNumbers(double number1, double number2){
        if(number2 == 0){
            return 0;
        }
        return number1 / number2;
    }

//    public double divideTwoNumbers(double number1, double number2){
//        if(number2 != 0){
//            return number1 / number2;
//        }
//        return 0;
//    }

    public double sumWithVarargs(double... numbers){
        double result = 0;
        for(double number : numbers){
            result += number;
        }
        return result;
    }

}
