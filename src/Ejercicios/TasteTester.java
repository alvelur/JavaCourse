package Ejercicios;

public class TasteTester {

    public static void main(String[] args) {
        BirthdayCake birthdayCake = new BirthdayCake("Chocolate", 5);
        WeddingCake weddingCake = new WeddingCake("Vanilla", 4);

        birthdayCake.setPrice(50000);
        weddingCake.setPrice(100000);

        System.out.println("The taste of your birthday cake is " + birthdayCake.getFlavor() + " and its price is "
                +birthdayCake.getPrice());
        System.out.println("The taste of your wedding cake is " + weddingCake.getFlavor() + " and its price is "
                +weddingCake.getPrice());


    }
}
