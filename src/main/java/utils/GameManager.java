package utils;

import view.InputView;
import view.OutputView;
import racingcar.Car;

import java.util.*;
import java.util.stream.Collectors;

public class GameManager {

    private static final Scanner scanner = new Scanner(System.in);

    private static List<Car> getWinner(Map<Car, Integer> carMap) {
        int max = getMaxRecord(carMap);
        return carMap.keySet().stream().filter(car -> carMap.get(car) == max).collect(Collectors.toList());
    }

    private static List<Car> getWinner(List<Car> carList) {
        int max = getMaxRecord(carList);
        return carList.stream().filter(car -> car.getPosition() == max).collect(Collectors.toList());
    }

    private static int getMaxRecord(Map<Car, Integer> map) {

        return map.values()
                .stream()
                .mapToInt(e -> e)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public static void startGame() {

        OutputView.MsgInputCars();
        final List<Car> cars = CarManager.createCarList(InputView.inputCars(scanner.next()));
        OutputView.MsgInputNums();
        final int repetition = InputView.inputReps();

        for (int i = 0; i < repetition; i++) {
            CarManager.race(cars);
            OutputView.printRaceResult(cars);
        }

        OutputView.finalResult(getWinner(cars));
    }
}
