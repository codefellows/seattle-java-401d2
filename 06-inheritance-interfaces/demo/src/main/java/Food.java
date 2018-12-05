public class Food extends Object implements EnergyHaver {
    private int energy;

    public Food(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public String toString() {
        return "A food with energy " + this.energy;
    }
}
