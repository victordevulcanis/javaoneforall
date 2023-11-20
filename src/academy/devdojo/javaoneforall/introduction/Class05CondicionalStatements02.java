package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatements02 {

    public static void main(String[] args) {

        int age = 20;
        String category;

        if (age < 15) {
            category = "Category Junior";
        } else if (age > 15 && age < 18) {
            category = "Category Senior";
        } else {
            category = "Category Master";
        }
//        category = age < 15 ? "Category Junior" : age > 15 && age < 18 ? "Category Senior" : "Category Master";
        System.out.println(category);

    }
}
