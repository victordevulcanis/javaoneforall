package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatements01 {

    public static void main(String[] args) {

        int age = 20;

        boolean isAllowedToBuyAlcohol = age >= 18;

        if (isAllowedToBuyAlcohol) {
            System.out.println("Authorized to buy alcohol");
        } else {
            System.out.println("Not authorized to buy alcohol");
        }

//        if(!isAllowedToBuyAlcohol){
//            System.out.println("Not authorized to buy alcohol");
//        }

        boolean c = false;
        if (c = false) {
            System.out.println("Weird condition");
        }


    }
}
