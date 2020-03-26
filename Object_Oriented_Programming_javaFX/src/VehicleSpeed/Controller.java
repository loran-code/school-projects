package VehicleSpeed;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Controller {

    VehicleSpeed.Motorcycle motorcycle1 = new VehicleSpeed.Motorcycle(0, 120, 2, "BMW motor");
    Car car1 = new Car(0, 100, 4, "BMW car");
    VehicleSpeed.Moped moped1 = new VehicleSpeed.Moped(0, 30, 2, "Zundapp moped");

    @FXML
    private Label showMessage = new Label();

    @FXML
    public void initialize() {
        showMessage.setText(" ");
    }

    @FXML
    public void buttonIncreaseSpeedCar() {
        if (car1.getSpeed() < car1.getMaxSpeed()) {
            car1.setSpeed(car1.getSpeed() + 10);
        }
        if (car1.getSpeed() < car1.getMaxSpeed()) {
            showMessage
                    .setText("speed increase by 10 the " + car1.getName() + " is going at " + car1.getSpeed() + "m/ph");
        } else {
            showMessage.setText(car1.getName() + " is at it's speed limit of " + car1.getMaxSpeed() + "m/ph");
        }
    }

    @FXML
    public void buttonSlowdownspeedCar() {
        if (car1.getSpeed() > 0) {
            car1.setSpeed(car1.getSpeed() - 10);
        }
        if (car1.getSpeed() > 0) {
            showMessage.setText(
                    "speed decreased by 10 the " + car1.getName() + " is going at " + car1.getSpeed() + "m/ph");
        } else {
            showMessage.setText(car1.getName() + " has stopped");
        }
    }

    @FXML
    public void buttonIncreaseSpeedMoped() {
        if (moped1.getSpeed() < moped1.getMaxSpeed()) {
            moped1.setSpeed(moped1.getSpeed() + 10);
        }
        if (moped1.getSpeed() < moped1.getMaxSpeed()) {
            showMessage.setText(
                    "speed increase by 10 the " + moped1.getName() + " is going at " + moped1.getSpeed() + "m/ph");
        } else {
            showMessage.setText(moped1.getName() + " is at it's speed limit of " + moped1.getMaxSpeed() + "m/ph");
        }
    }

    @FXML
    public void buttonSlowdownspeedMoped() {
        if (moped1.getSpeed() > 0) {
            moped1.setSpeed(moped1.getSpeed() - 10);
        }
        if (moped1.getSpeed() > 0) {
            showMessage.setText(
                    "speed decreased by 10 the " + moped1.getName() + " is going at " + moped1.getSpeed() + "m/ph");
        } else {
            showMessage.setText(moped1.getName() + " has stopped");
        }
    }

    @FXML
    public void buttonIncreaseSpeedMotorcycle() {
        try {
            if (motorcycle1.getSpeed() < motorcycle1.getMaxSpeed()) {
                motorcycle1.setSpeed(motorcycle1.getSpeed() + 10);
            }

            if (motorcycle1.getSpeed() < motorcycle1.getMaxSpeed()) {
                showMessage.setText("speed increase by 10 the " + motorcycle1.getName() + " is going at "
                        + motorcycle1.getSpeed() + "m/ph");
            } else {
                showMessage.setText(
                        motorcycle1.getName() + " is at it's speed limit of " + motorcycle1.getMaxSpeed() + "m/ph");
            }
        } catch (Exception e) {
            System.out.println("An error has occured, please contact the creator of this application");
        }
    }

    @FXML
    public void buttonSlowdownspeedMotorcycle() {
        try {
            if (motorcycle1.getSpeed() > 0) {
                motorcycle1.setSpeed(motorcycle1.getSpeed() - 10);
            }

            if (motorcycle1.getSpeed() > 0) {
                showMessage.setText("speed decreased by 10 the " + motorcycle1.getName() + " is going at "
                        + motorcycle1.getSpeed() + "m/ph");
            } else {
                showMessage.setText(motorcycle1.getName() + " has stopped");
            }
        } catch (Exception e) {
            System.out.println("An error has occured, please contact the creator of this application");
        }
    }
}
