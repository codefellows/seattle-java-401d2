import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void walk() {
    }

    @Test
    public void exercise() {
    }

    @Test
    public void testEat() {
        Person p = new Person();
        assertEquals(3, p.energyLevel);
        Food f = new Pizza();
        p.eat(f);
        assertEquals(8, p.energyLevel);

        Food secondFood = new Zucchini();
        p.eat(secondFood);
        assertEquals(9, p.energyLevel);
    }

    @Test
    public void testEnergy() {
        Person p = new Person();
        Car c = new Car(15, 12);
        Zucchini z = new Zucchini();

        List<EnergyHaver> energyHavers = new ArrayList();
        energyHavers.add(p);
        energyHavers.add(c);
        energyHavers.add(z);

        int totalEnergy = 0;
        for (EnergyHaver energyHaver : energyHavers) {
            totalEnergy += energyHaver.getEnergy();
        }
        assertEquals(2404, totalEnergy);
    }
}