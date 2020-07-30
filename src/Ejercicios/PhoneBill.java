package Ejercicios;

public class PhoneBill {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(int baseCost) {
        this.baseCost = baseCost;
    }

    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }

    public void setNumberOfMinutes(int numberOfMinutes) {
        this.numberOfMinutes = numberOfMinutes;
    }

    public int getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(int minutesUsed) {
        this.minutesUsed = minutesUsed;
    }

    private int baseCost;
    private int numberOfMinutes;
    private int minutesUsed;

    public PhoneBill(int id, int baseCost, int numberOfMinutes, int minutesUsed) {
        this.id = id;
        this.baseCost = baseCost;
        this.numberOfMinutes = numberOfMinutes;
        this.minutesUsed = minutesUsed;
    }

     public PhoneBill(int id){
        this.id = id;
         baseCost = 79;
         numberOfMinutes = 800;
         minutesUsed = 800;
     }

    public PhoneBill(){
        id = 0;
        baseCost = 79;
        numberOfMinutes = 800;
        minutesUsed = 800;
    }

    public double calculateTax(double planFee, double overage){

        double tax = (planFee+ overage)* 0.15;
        System.out.println("Tax: "+ tax);
        return tax;
    }
    public double calculateTotal(double planFee, double overage, double tax){

        double total = planFee + overage +tax;
        System.out.println("Total: "+total);
        return total;
    }


}
