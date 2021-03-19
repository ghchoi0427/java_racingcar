package view;

import racingcar.Car;

import java.util.List;
import java.util.Map;

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

    public static void printRaceResult(List<Car> carList) {

        for (Car car : carList) {
            System.out.format("%s : %s", car.getName(), progressBarFactory(car.getPosition())).println();
        }
        System.out.println();
    }

    private static String progressBarFactory(int distance) {
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < distance; i++) {
            bar.append("-");
        }
        return bar.toString();
    }

    public static void finalResult(List<Car> winnerList) {
        for (Car c : winnerList) {
            MSG_FINAL += String.format("%s ", c.getName());
        }
        System.out.println(MSG_FINAL);
    }
}
