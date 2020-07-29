package Ejercicios;

public class WeddingCake extends Cake {

    private int tiers;

    public WeddingCake(String flavor, int tiers) {
        super(flavor);
        this.tiers = tiers;
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
