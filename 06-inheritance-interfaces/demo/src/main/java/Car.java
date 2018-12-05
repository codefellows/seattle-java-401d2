public class Car implements EnergyHaver {
    private static final int ENERGY_IN_ONE_GALLON_OF_GAS = 200;

    private int tankMaxCapacity;
    private int gallonsInTank;
    private int mpg;

    public Car(int capacity, int gallonsInTank) {
        this.tankMaxCapacity = capacity;
        this.gallonsInTank = gallonsInTank;
        this.mpg = 5;
    }

    public int getEnergy() {
        return this.gallonsInTank * ENERGY_IN_ONE_GALLON_OF_GAS;
    }

    public void drive(int miles) {
        this.gallonsInTank -= miles/this.mpg;
    }

    public String toString() {
        return "Car capacity=" + this.tankMaxCapacity + " gallonsInTank=" + this.gallonsInTank;
    }
}
