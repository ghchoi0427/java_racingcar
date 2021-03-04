package utils;

import racingcar.Car;

import java.util.*;

public class CarManager {
    GameManager gm = new GameManager();

    public void createCars(String[] carNames) {
        Map<Car, Integer> progress = new HashMap<>();

        for (int i = 0; i < carNames.length; i++) {
            progress.put(new Car(carNames[i]), 0);
        }
        gm.rData.setProgress(progress);
    }

    public void race() {
        Map<Car, Integer> progress = gm.rData.getProgress();
        Set<Car> cars = progress.keySet();
        for (Car c : cars) {
            int temp = progress.get(c);
            progress.put(c, temp + moveCar());
        }

        System.out.println(progress);
        gm.rData.setProgress(progress);
    }

    public int moveCar() {
        if (moveOrStay()) {
            return 1;
        }
        return 0;
    }

    public boolean moveOrStay() {
        int random = RandomUtils.nextInt(0, 9);
        if (random >= 4) {
            return true;
        }
        return false;
    }
}
