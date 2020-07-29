package chapter3;

import java.util.Scanner;

public class Qualifier {

    public static void main(String args[]){

        int requiredSalary = 30000;
        int requiredYears = 2;

        System.out.println("Enter your salary: ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Enter your experience in years2: ");
        double years = scanner.nextDouble();

        scanner.close();

        if(salary >= requiredSalary){
            if (years >= years){
                System.out.println("You meet the requirements");
            }
            else {
                System.out.println("You need to stay working more time at your current work, at least " +requiredYears);
            }
        }
        else {
            System.out.println("You must gain at least "+ requiredSalary+ " to qualify");
        }

    }
}
