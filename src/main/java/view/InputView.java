package view;

import utils.InputValidator;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static String[] inputCars(String cars) {
        InputValidator.carNameInputValidator(cars);
        return cars.split(",");
    }

    public static int inputRepetition() {
        int repetition = scanner.nextInt();
        InputValidator.repetitionInputValidator(repetition);
        return repetition;
    }
}
