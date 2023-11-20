package academy.devdojo.javaoneforall.introduction;

import org.w3c.dom.ls.LSOutput;

public class Class03PrimitiveTypesExercise {

    public static void main(String[] args) {

        String name = "Victor";
        String adress = "Im Kamp, 15";
        double salary = 2500;
        // dd/MM/yyyy
        String salaryDateReceived = "02/10/2023";
        String report = "I " + name + " living at " + adress +
                " confirm that I received the salary of " + salary + " on " + salaryDateReceived;

        System.out.println(report);

    }
}
