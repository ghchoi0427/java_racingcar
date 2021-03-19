package view;

import utils.InputValidator;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static String[] inputCars(String cars) {
        InputValidator.carNameInputVal(cars);
        return cars.split(",");
    }

    public static int inputRepetition() {
        int repetition = scanner.nextInt();
        InputValidator.repInputVal(repetition);
        return repetition;
    }
}
