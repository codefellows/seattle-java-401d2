public class Person implements EnergyHaver {
    int energyLevel;

    public Person() {
        this.energyLevel = 3;
    }

    public void walk() {
        this.energyLevel--;
    }

    public void exercise() {
        this.energyLevel -= 2;
    }

    public void eat(Food food) {
        this.energyLevel += food.getEnergy();
    }

    public int getEnergy() {
        return this.energyLevel;
    }
}
