package domain;

import java.util.Map;

public class Car {

    private final String[] cars;

    public Car(String[] cars) {
        checkCarName(cars);
        this.cars = cars;
    }

    private void checkCarName(String[] cars) {
        for (String carName : cars){
            checkNameLength(carName);
        }
    }

    private void checkNameLength(String carName) {
        if(carName.length()>5 ||carName.length()==0){
            throw new IllegalArgumentException();
        }
    }
}
