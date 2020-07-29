package chapter3;

import java.util.Scanner;

public class QualifierLogical {
    public static void main(String args[]){

        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your experience in years2: ");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary && years >= requiredYears){
                System.out.println("You meet the requirements");
            }
         else {
            System.out.println("You must gain at least "+ requiredSalary+ " to qualify");
        }

    }

}
