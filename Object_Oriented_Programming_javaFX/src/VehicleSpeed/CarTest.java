package VehicleSpeed;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

class CarTest {

    @Test
    void getMaxSpeed() throws Exception {
        fail("Has yet to be implemented");
    }

    @Test
    void setMaxSpeed() {
    }

    @Test
    void getWheels() throws Exception {
        fail("Has yet to be implemented");
    }

    @Test
    void setWheels() {
    }

    @Test
    void checkAmountOfWheels() {
        Car car1 = new Car(0, 100, 4, "BMW");
        Assert.assertTrue(car1.getWheels() == 4);
    }

    @Test
    void checkMaxSpeed() {
        Car car1 = new Car(0, 100, 4, "BMW");
        Assert.assertTrue(car1.getMaxSpeed() == 100);
    }
}