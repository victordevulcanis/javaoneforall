package academy.devdojo.javaoneforall.introduction;

public class Class04Operators {

    public static void main(String[] args) {
        // + - / *
        int number01 = 10;
        int number02 = 20;
        int result = number01 - number02;
        System.out.println(result);

        //%
        int modulo = 21 % 4;
        System.out.println(modulo);

        // < > <= >= != ==
        boolean isTenLowerThanTwenty = 10 < 20;
        boolean isTenGreaterThanTwenty = 10 > 20;
        System.out.println(isTenLowerThanTwenty);
        System.out.println(isTenGreaterThanTwenty);

        // && ||

        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;
        System.out.println(isLegalOlderThanThirty);
        System.out.println(isLegalYoungerThanThirty);


        double currentAccount = 200;
        double savingsAccount = 2000;
        double playstationFivePrice = 500;
        boolean canBeBought = currentAccount >= playstationFivePrice || savingsAccount >= playstationFivePrice;

        System.out.println("Can I buy the Playstation Five? " + canBeBought);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 11;
        System.out.println(bonus);

        // Unary ++ --
        int count = 0;
        count++;
        System.out.println(count);
        count--;

    }



}
