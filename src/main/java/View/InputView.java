package View;

import utils.InputValidator;

public class InputView {

    public static String[] inputCars(String cars){
        InputValidator.carNameInputVal(cars);
        String[] carNames = cars.split(",");
        return carNames;
    }

    public static void inputReps(int reps){

    }
}
