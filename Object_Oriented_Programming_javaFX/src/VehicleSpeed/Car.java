// Loran van den Akker - Object georiënteerd  programmeren - 20-2-2020

package VehicleSpeed;

import java.util.ArrayList;

public class Car extends VehicleSpeed.Vehicle {

    public Car(int speed, int maxSpeed, int wheels, String name) {
        super(speed, maxSpeed, wheels, name);
    }

    // Geen Toepassing voor kunnen maken.
    private ArrayList<Integer> speedIncrease = new ArrayList();

    @Override
    public void Speed(int speed) {
        speed = getSpeed();
    }

    @Override
    public void SlowDownSpeed(int slowSpeed) {

    }
}
