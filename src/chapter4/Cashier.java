package chapter4;

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numer of items woul u like to scan");
        int quantity = scanner.nextInt();

        int total = 0;

        for (int i = 0; i < quantity; i++) {

            System.out.println("Enter the cost of the item");
            int price = scanner.nextInt();

            total = total + price;
        }
        System.out.println("Your total is :" + total);
    }
}
