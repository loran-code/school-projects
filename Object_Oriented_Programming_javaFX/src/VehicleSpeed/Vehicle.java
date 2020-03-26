package VehicleSpeed;

public abstract class Vehicle implements VehicleSpeed.SpeedAndBreak {

    private int speed;
    private int maxSpeed;
    private int wheels;
    private String name;

    public Vehicle(int speed, int maxSpeed, int wheels, String name) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Speed(int speed) {
        System.out.println("Default speed for vehicles start at 0");
    }

    @Override
    public void SlowDownSpeed(int slowSpeed) {

    }
}
