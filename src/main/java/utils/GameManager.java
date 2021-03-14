package utils;

import View.InputView;
import View.OutputView;
import racingcar.Car;

import java.util.*;
import java.util.stream.Collectors;

public class GameManager {

    private static final Scanner scanner = new Scanner(System.in);

    private static List<Car> getWinner(Map<Car, Integer> carMap) {
        List<Car> winners;
        int max = getMaxRecord(carMap);
        winners = carMap.keySet().stream().filter(car -> carMap.get(car) == max).collect(Collectors.toList());
        return winners;
    }

    private static int getMaxRecord(Map<Car, Integer> map) {

        return map.values().stream().mapToInt(e -> e).max().orElseThrow(NoSuchElementException::new);
    }

    public static void startGame() {

        OutputView.MsgInputCars();
        LinkedHashMap<Car, Integer> cars = CarManager.createCarMap(InputView.inputCars(scanner.next()));
        OutputView.MsgInputNums();
        final int rep = InputView.inputReps();

        for (int i = 0; i < rep; i++) {
            cars = CarManager.race(cars);
            OutputView.printRaceResult(cars);
        }

        OutputView.finalResult(getWinner(cars));
    }
}
