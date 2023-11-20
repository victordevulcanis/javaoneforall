package academy.devdojo.javaoneforall.javacore.objectorientation.Gassociation.test;

import java.util.Scanner;

public class InputtingKeyboardDataTest01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type your full name");
        String name = scanner.nextLine();
        System.out.println("Please type your age");
        int age = scanner.nextInt();
        System.out.println("Please type M or F for your gender");
        char gender = scanner.next().charAt(0);


        System.out.println("----------------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

    }

}
