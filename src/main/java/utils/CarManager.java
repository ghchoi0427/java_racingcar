package utils;

import racingcar.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarManager {
    GameManager gm = new GameManager();

    public void createCars(String[] carNames) {
        Map<Car,Integer> progress = new HashMap<>();

        for (int i = 0; i < carNames.length; i++) {
            progress.put(new Car(carNames[i]),0);
        }
        gm.rData.setProgress(progress);
    }

    public void moveCar() {

    }

    public boolean moveOrStay() {
        int random = RandomUtils.nextInt(0, 9);
        if (random >= 4) {
            return true;
        }
        return false;
    }

}
