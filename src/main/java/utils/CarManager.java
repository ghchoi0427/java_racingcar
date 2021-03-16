package utils;

import racingcar.Car;

import java.util.*;

public class CarManager {

    private static final int MINIMUM_MOVE_CONDITION = 4;

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
            moveCar(carMap, c);
        }
    }

    private static void moveCar(LinkedHashMap<Car, Integer> carMap, Car car) {
        if (isMovable()) {
             carMap.put(car, carMap.get(car)+1);
        }
    }

    private static boolean isMovable() {
        return RandomUtils.nextInt(0, 9) >= MINIMUM_MOVE_CONDITION;
    }
}
