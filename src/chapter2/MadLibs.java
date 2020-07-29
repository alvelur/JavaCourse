package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]){

        System.out.println("Enter a season of the year: ");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective: ");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective+" "+ season+ " day, I drink a minimun of "+number+" cups of coffee");
    }
}
