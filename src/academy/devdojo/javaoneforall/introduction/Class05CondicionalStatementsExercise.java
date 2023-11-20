package academy.devdojo.javaoneforall.introduction;

public class Class05CondicionalStatementsExercise {

    public static void main(String[] args) {

        double annualSalary = 40000;
        double taxBracket1 = annualSalary * 0.097;
        double taxBracket2 = annualSalary * 0.3735;
        double taxBracket3 = annualSalary * 0.495;
        double taxes;

        if(annualSalary <= 34712){
            taxes = taxBracket1;
        } else if (annualSalary >= 34713 && annualSalary <= 68507){
            taxes = taxBracket2;
        } else{
            taxes = taxBracket3;
        }
//taxes = annualSalary <= 34712 ? taxBracket1 : annualSalary >= 34713 && annualSalary <= 68507 ? taxBracket2 : 68508;
        System.out.println(taxes);
    }
}
