package Ejercicios;

import java.util.Scanner;

public class DayOfTheWeek {
    ;


    public static void main(String[] args) {

        String[] days = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        System.out.println("Your lucky day is: "+days[day-1]+ " Congrats");

    }
}
