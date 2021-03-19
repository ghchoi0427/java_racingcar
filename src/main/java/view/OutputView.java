package view;

import racingcar.Car;

import java.util.List;

public class OutputView {

    private static final String MSG_INPUT_CAR_NAMES = "Please input names of cars.(names are distinguished by comma(,))";
    private static final String MSG_INPUT_REPS = "how many repetitions?";

    private OutputView() {
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
        lineFeed();
    }

    private static void lineFeed() {
        System.out.println();
    }

    private static String progressBarFactory(int distance) {
        StringBuilder bar = new StringBuilder();
        for (int i = 0; i < distance; i++) {
            bar.append("-");
        }
        return bar.toString();
    }

    public static void printFinalResult(List<Car> winnerList) {
        StringBuilder MSG_FINAL = new StringBuilder();
        MSG_FINAL.append("final winner : ");
        for (Car c : winnerList) {
            MSG_FINAL.append(String.format("%s ", c.getName()));
        }
        System.out.println(MSG_FINAL.toString());
    }
}
