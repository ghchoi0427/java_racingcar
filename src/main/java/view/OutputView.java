package view;

import racingcar.Car;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class OutputView {

    private static final String MSG_INPUT_CAR_NAMES = "Please input names of cars.(names are distinguished by comma(,))";
    private static final String MSG_INPUT_REPS = "how many repetitions?";
    private static String MSG_FINAL = "final winner : ";

    public OutputView() {
    }

    public static void MsgInputCars() {
        System.out.println(MSG_INPUT_CAR_NAMES);
    }

    public static void MsgInputNums() {
        System.out.println(MSG_INPUT_REPS);
    }

    public static void printRaceResult(Map<Car, Integer> CarMap) {
        Set<Car> carSet = CarMap.keySet();

        for (Car c : carSet) {
            System.out.format("%s : %s", c.getName(), progressBarFactory(CarMap.get(c))).println();
        }
        System.out.println();
    }

    private static String progressBarFactory(int distance) {
        String bar = "";
        for (int i = 0; i < distance; i++) {
            bar += "-";
        }
        return bar;
    }

    public static void finalResult(List<Car> winnerList) {
        for (Car c : winnerList) {
            MSG_FINAL += String.format("%s ", c.getName());
        }
        System.out.println(MSG_FINAL);
    }
}
