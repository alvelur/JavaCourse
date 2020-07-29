package chapter3;

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String arg[]) {
        int quota = 10;

        System.out.println("How many sales did the employee make this week: ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) {
            System.out.println("Congratulations!!!!! ");
        }
        else {
            int missing = quota - sales;
            System.out.println("You should work more!!!!!, they were "+missing+ " missing");
        }

    }
}
