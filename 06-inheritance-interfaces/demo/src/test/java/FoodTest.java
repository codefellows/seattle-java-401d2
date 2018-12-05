import org.junit.Test;

import static org.junit.Assert.*;

public class FoodTest {

    @Test
    public void testFoodConstructor() {
        Food f = new Food(12);
        System.out.println(f);

        Car c = new Car(15, 12);
        System.out.println(c);
    }
}