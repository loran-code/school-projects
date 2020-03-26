package VehicleSpeed;

public class Moped extends VehicleSpeed.Vehicle {

    public Moped(int speed, int maxSpeed, int wheels, String name) {
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
