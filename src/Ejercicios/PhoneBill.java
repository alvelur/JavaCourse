package Ejercicios;

public class PhoneBill {

    private int id;
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
     }

    public PhoneBill(){
        id = 0;
        baseCost = 0;
        numberOfMinutes = 0;
        minutesUsed = 0;
    }


}
