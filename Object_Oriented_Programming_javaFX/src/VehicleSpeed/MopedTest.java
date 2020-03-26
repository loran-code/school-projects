package VehicleSpeed;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MopedTest {

    @Test
    void speed() {
    }

    @Test
    void slowDownSpeed() {
    }

    @Test
    void testSpeed() {
    }

    @Test
    void testSlowDownSpeed() {
    }

    @Test
    void checkAmounOfWheels() {
        Moped moped1 = new Moped(0, 30, 2, "Zundapp");
        Assert.assertTrue(moped1.getWheels() == 3);
    }

    @Test
    void checkMaxSpeed() {
        Moped moped1 = new Moped(0, 30, 2, "Zundapp");
        Assert.assertTrue(moped1.getMaxSpeed() == 30);
    }
}