package VehicleSpeed;

import java.util.ArrayList;

public class Motorcycle extends Vehicle {

    public Motorcycle(int speed, int maxSpeed, int wheels, String name) {
        super(speed, maxSpeed, wheels, name);
    }

    @Override
    public void Speed(int speed) {
        speed = getSpeed();
    }

    @Override
    public void SlowDownSpeed(int slowSpeed) {
        super.SlowDownSpeed(slowSpeed);
    }
}