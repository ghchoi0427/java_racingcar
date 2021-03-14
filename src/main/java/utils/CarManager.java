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

    public static LinkedHashMap<Car, Integer> race(LinkedHashMap<Car, Integer> carMap) {
        Set<Car> carSet = carMap.keySet();
        for (Car c : carSet) {
            int temp = carMap.get(c);
            carMap.put(c, temp + moveCar());
        }
        return carMap;
    }

    private static int moveCar() {
        if (moveOrStay()) {
            return 1;
        }
        return 0;
    }

    private static boolean moveOrStay() {
        int random = RandomUtils.nextInt(0, 9);
        return random >= 4;
    }
}
