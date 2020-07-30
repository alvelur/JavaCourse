package Ejercicios;

import java.util.Scanner;

public class PhoneBillCalculator1 {

    static Scanner scanner = new Scanner(System.in);
    static double charge = 0.25;


    public static void main(String[] args) {

        double planfee = getPlanFee();
        double overage = getOverageMinutes();
        double tax = calculateTax(planfee,overage);
        calculateTotal(planfee,overage,tax);

        //calculateTotal(getPlanFee(),getOverageMinutes(),calculateTax(getPlanFee(),getOverageMinutes()));
    }

    public static double getPlanFee(){
        System.out.println("Enter your Plan fee");
        double planFee = scanner.nextDouble();
        return planFee;

    }

    public static double getOverageMinutes(){
        System.out.println("Enter your Overage");
        double overage = scanner.nextDouble();
        double overageTotal = overage * 0.25;
        return overageTotal;
    }
    public static double calculateTax(double planFee, double overage){

        double tax = (planFee+ overage)* 0.15;
        System.out.println("Tax: "+ tax);
        return tax;
    }
    public static double calculateTotal(double planFee, double overage, double tax){

        double total = planFee + overage +tax;
        System.out.println("Total: "+total);
        return total;
    }

}
