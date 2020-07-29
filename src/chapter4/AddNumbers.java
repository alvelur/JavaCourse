package chapter4;

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean again = false;
        do {

            System.out.println("Enter the first number: ");
            int n1 = scanner.nextInt();
            System.out.println("Enter the first number: ");
            int n2 = scanner.nextInt();

            int sum = n1+n2;
            System.out.println("The result is :" +sum);

            System.out.println("Would u want to do another addition");
            again = scanner.nextBoolean();

        }while (again);
    }
}
