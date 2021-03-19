package utils;

import view.InputView;
import racingcar.Car;

import java.util.*;
import java.util.stream.Collectors;

import static utils.CarManager.*;
import static view.OutputView.*;

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

        MsgInputCars();
        final List<Car> cars = createCarList(InputView.inputCars(scanner.next()));
        MsgInputNums();
        final int repetition = InputView.inputRepetition();

        for (int i = 0; i < repetition; i++) {
            race(cars);
            printRaceResult(cars);
        }

        printFinalResult(getWinner(cars));
    }
}
