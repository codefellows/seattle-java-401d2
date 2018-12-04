public class Food implements EnergyHaver {
    private int energy;

    public Food(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }
}
