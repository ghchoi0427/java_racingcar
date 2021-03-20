package racingcar;

import java.util.*;
import java.util.stream.Collectors;

public class CarManager {
    private final List<Car> cars;
    private int repetition;

    public CarManager(final String[] carNames, final int repetition) {
        this(Arrays.stream(carNames)
                .map(Car::new)
                .collect(Collectors.toList()), repetition);
    }

    public CarManager(final List<Car> cars, final int repetition) {
        this.cars = new ArrayList<>(cars);
        this.repetition = repetition;
    }

    public void race() {
        cars.stream()
                .filter(Car::isMovable)
                .forEach(Car::moveOn);

        repetition--;
    }

    public boolean isRaceOver() {
        return repetition < 0;
    }

    public List<Car> getWinner() {
        return cars.stream()
                .filter(car -> car.isOnPosition(getMaxRecord(cars)))
                .collect(Collectors.toList());
    }

    private int getMaxRecord(final List<Car> carList) {
        return carList.stream()
                .mapToInt(Car::getPosition)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public List<Car> getCars() {
        return new ArrayList<>(cars);
    }
}
