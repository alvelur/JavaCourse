package chapter6;

import java.util.Scanner;

public class HomeAreaCalculator2 {

    public static void main(String args[]) {

        HomeAreaCalculator2 calculator2 = new HomeAreaCalculator2();
        Rectangle kitchen = calculator2.getRoom();
        Rectangle bathroom = calculator2.getRoom();

        double area = calculator2.calculateTotalArea(kitchen,bathroom);
        System.out.println("The total Area is "+area);

    }
    public Rectangle getRoom(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of your room");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room");
        double width = scanner.nextDouble();

        Rectangle room = new Rectangle(length, width);
        return room;

    }
    public double calculateTotalArea(Rectangle rectangle1, Rectangle rectangle2){

        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

}
