package utils;

import racingcar.Car;

import java.util.*;

public class CarManager {

    private static final int MINIMUM_MOVE_CONDITION = 4;

    public CarManager() {
    }

    public static List<Car> createCarList(String[] carNames) {
        List<Car> carList = new ArrayList<>();
        for (String carName : carNames) {
            carList.add(new Car(carName));
        }
        return carList;
    }

    public static void race(List<Car> carList) {
        for (Car car : carList) {
            car.moveOn();
        }
    }

    private static void moveCar(LinkedHashMap<Car, Integer> carMap, Car car) {
        if (isMovable()) {
            carMap.put(car, carMap.get(car) + 1);
        }
    }

    private static boolean isMovable() {
        return RandomUtils.nextInt(0, 9) >= MINIMUM_MOVE_CONDITION;
    }
}
