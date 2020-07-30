package Ejercicios;

public class PhoneInstanciation {

    public static void main(String[] args) {

        PhoneBill phoneBill = new PhoneBill(1,90, 80,100);
        int overage = phoneBill.getMinutesUsed() - phoneBill.getNumberOfMinutes();
        double tax = phoneBill.calculateTax(phoneBill.getBaseCost(), overage);
        phoneBill.calculateTotal(phoneBill.getBaseCost(), overage, tax);


    }
}
