package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        int rate = 15;
        int maxHours = 40;

        System.out.println("Enter the number of hours the employee worked: ");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        while(hours > maxHours || hours <= 1){
            System.out.println("Invalid entry. Hours worked must be less than the number of work hours allowed, try again");
            hours = scanner.nextInt();
        }
        scanner.close();

        double result = hours * rate;
        System.out.println("Your pay is :" +result);

    }

}
