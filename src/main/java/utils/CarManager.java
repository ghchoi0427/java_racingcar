package utils;

import racingcar.Car;

import java.util.*;

public class CarManager {

    public CarManager() {
    }

    public static LinkedHashMap<Car, Integer> createCarMap(String[] carNames) {

        LinkedHashMap<Car, Integer> carHashMap = new LinkedHashMap<>();

        for (int i = 0; i < carNames.length; i++) {
            carHashMap.put(new Car(carNames[i]), 0);
        }
        return carHashMap;
    }

    public static void race(LinkedHashMap<Car, Integer> carMap) {
        for (Car c : carMap.keySet()) {
            carMap.put(c, carMap.get(c) + moveCar());
        }
    }

    private static int moveCar() {
        if (isMovable()) {
            return 1;
        }
        return 0;
    }

    private static boolean isMovable() {
        return RandomUtils.nextInt(0, 9) >= 4;
    }
}
