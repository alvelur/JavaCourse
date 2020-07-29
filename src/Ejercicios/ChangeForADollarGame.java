package Ejercicios;

import java.util.Scanner;

public class ChangeForADollarGame {
    public static void main(String[] args) {

        int pennies;
        int nickels;
        int dimes;
        int quarters;
        int DOLLAR = 4000;
        int valorObtenido;
        int exceed;
        int missing;

        //Pennies = monedas de 100
        System.out.println("Enter your pennies");
        Scanner scanner = new Scanner(System.in);
        pennies = scanner.nextInt();
        pennies = pennies * 100;

        //Nickels = monedas de 200
        System.out.println("Enter your nickels");
        nickels = scanner.nextInt();
        nickels =  nickels * 200;

        //Dimes = monedas de 500
        System.out.println("Enter your dimes");
        dimes = scanner.nextInt();
        dimes = dimes * 500;

        //Quarters = monedas de 1000
        System.out.println("Enter your quarters");
        quarters = scanner.nextInt();
        quarters = quarters * 1000;

        valorObtenido = pennies + dimes + quarters + nickels;


        if(valorObtenido == DOLLAR){

            System.out.println("You WON!!!!!!!");

        }else if(valorObtenido > DOLLAR){
            exceed = valorObtenido - DOLLAR;
            System.out.println("You exceed the valor for: " + exceed);
        }else {
            missing = DOLLAR - valorObtenido;
            System.out.println("They were " +missing+ " missing");
        }





    }

}
