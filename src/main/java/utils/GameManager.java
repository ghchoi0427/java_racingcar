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

    private static int getMaxRecord(Map<Car, Integer> map) {

        return map.values()
                .stream()
                .mapToInt(e -> e)
                .max()
                .orElseThrow(NoSuchElementException::new);
    }

    public static void startGame() {

        OutputView.MsgInputCars();
        final LinkedHashMap<Car, Integer> cars = CarManager.createCarMap(InputView.inputCars(scanner.next()));
        OutputView.MsgInputNums();
        final int rep = InputView.inputReps();

        for (int i = 0; i < rep; i++) {
            CarManager.race(cars);
            OutputView.printRaceResult(cars);
        }

        OutputView.finalResult(getWinner(cars));
    }
}
