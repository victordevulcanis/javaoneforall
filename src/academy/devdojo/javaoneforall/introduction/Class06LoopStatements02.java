package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements02 {
    //given a total number, for example 50, print the first 25
    public static void main(String[] args) {

        int maxNumber = 50;

        for (int i = 0; i <= maxNumber; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
