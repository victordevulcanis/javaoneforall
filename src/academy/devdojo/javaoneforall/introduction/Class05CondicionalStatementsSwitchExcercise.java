package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatementsSwitchExcercise {

    public static void main(String[] args) {

        int day = 5;
        switch (day) {
            case 1:
            case 7:
                System.out.println("Business Day");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
