package chapter5;

import java.util.Scanner;

public class CreditCheck {

    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double salary = getSalary();
        double creditScore = getCreditScore();
        scanner.close();
        boolean isUserQualified = isUserQualified(salary,creditScore);
        notifyUser(isUserQualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary");
        double salary = scanner.nextDouble();
        return salary;

    }

    public static double getCreditScore(){
        System.out.println("Enter your credit score");
        int creditScore = scanner.nextInt();
        scanner.close();
        return creditScore;
    }


    public static boolean isUserQualified(double salary, double creditScore){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }else{
            return false;
        }
    }
    public static void notifyUser(boolean isUserQualified){

        if(isUserQualified){
            System.out.println("You're Qualified!!!");
        }else{
            System.out.println("Sorry, you have been declined");
        }

    }

}
