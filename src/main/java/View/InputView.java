package View;

import utils.InputValidator;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public static String[] inputCars(String cars){
        InputValidator.carNameInputVal(cars);
        String[] carNames = cars.split(",");
        return carNames;
    }

    public static int inputReps(){
        int repetition = scanner.nextInt();
        InputValidator.repInputVal(repetition);
        return repetition;
    }
}
