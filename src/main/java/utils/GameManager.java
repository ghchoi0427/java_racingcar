package utils;

import view.InputView;
import view.OutputView;
import racingcar.Car;

import java.util.*;
import java.util.stream.Collectors;

public class GameManager {

    private static final Scanner scanner = new Scanner(System.in);

    private static List<Car> getWinner(List<Car> carList) {
        return carList
                .stream()
                .filter(car -> car.getPosition() == getMaxRecord(carList))
                .collect(Collectors.toList());
    }

    private static int getMaxRecord(List<Car> carList) {
        return carList
                .stream()
                .map(car -> car.getPosition())
                .mapToInt(e -> e)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public static void startGame() {

        OutputView.MsgInputCars();
        final List<Car> cars = CarManager.createCarList(InputView.inputCars(scanner.next()));
        OutputView.MsgInputNums();
        final int repetition = InputView.inputRepetition();

        for (int i = 0; i < repetition; i++) {
            CarManager.race(cars);
            OutputView.printRaceResult(cars);
        }

        OutputView.finalResult(getWinner(cars));
    }
}
