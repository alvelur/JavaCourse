package Ejercicios;


public class BirthdayCake extends Cake {

    private int candles;

    public BirthdayCake(String flavor, int candles) {
        super(flavor);
        this.candles = candles;
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }

}
