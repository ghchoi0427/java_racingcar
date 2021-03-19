package utils;

import racingcar.Car;
import view.InputView;
import view.OutputView;

import java.util.*;
import java.util.stream.Collectors;

public class GameManager {

    private static final Scanner scanner = new Scanner(System.in);

    private GameManager() {
    }

    private static List<Car> getWinner(List<Car> carList) {
        return carList
                .stream()
                .filter(car -> car.getPosition() == getMaxRecord(carList))
                .collect(Collectors.toList());
    }

    private static int getMaxRecord(List<Car> carList) {
        return carList
                .stream()
                .map(Car::getPosition)
                .mapToInt(e -> e)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public static void startGame() {

        OutputView.msgInputCars();
        final List<Car> cars = CarManager.createCarList(InputView.inputCars(scanner.next()));
        OutputView.msgInputNums();
        final int repetition = InputView.inputRepetition();

        for (int i = 0; i < repetition; i++) {
            CarManager.race(cars);
            OutputView.printRaceResult(cars);
        }

        OutputView.printFinalResult(getWinner(cars));
    }
}
