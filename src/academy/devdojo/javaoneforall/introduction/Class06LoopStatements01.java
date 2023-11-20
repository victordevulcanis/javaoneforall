package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements01 {

    public static void main(String[] args) {
//while, do-while, for
        int counter = 0;

        while (counter < 10) {
            System.out.println("Inside While " + ++counter);
        }

        counter = 0;

        do {
            System.out.println("Inside Do-While " + ++counter);
        } while (counter < 10);

        for (counter = 1; counter <= 10; counter++) {
            System.out.println("Inside For " + counter);
        }
    }
}
