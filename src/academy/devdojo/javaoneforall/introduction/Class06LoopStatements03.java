package academy.devdojo.javaoneforall.introduction;

public class Class06LoopStatements03 {

    public static void main(String[] args) {

        double carPrice = 20000;

        for (int monthCount = (int) carPrice; monthCount >= 1; monthCount--) {
            double monthlyPrice = carPrice / monthCount;
            if (monthlyPrice < 1000) {
                continue;
            } else {
                System.out.println("Months: " + monthCount + ". Price per month: " + monthlyPrice);
            }
        }
    }
}
