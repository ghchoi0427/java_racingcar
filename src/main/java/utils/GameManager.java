package utils;

import View.InputView;
import View.OutputView;
import racingcar.Car;

import java.util.*;
import java.util.stream.Collectors;

public class GameManager {

    private static Scanner scanner = new Scanner(System.in);

    public List<Car> getWinner(Map<Car, Integer> carMap) {
        List<Car> winners = new ArrayList<>();
        int max = getMaxRecord(carMap);
        winners = carMap.keySet().stream().filter(car -> carMap.get(car) == max).collect(Collectors.toList());
        return winners;
    }

    private static int getMaxRecord(Map<Car, Integer> map) {
        int max = 0;
        for (Map.Entry<Car, Integer> entry : map.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
            }
        }
        return max;
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


        OutputView.finalResult();
    }
}
